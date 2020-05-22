package leduyhung.me.templatesimpleandroidapp.manager.screen;

import java.util.HashMap;

import leduyhung.me.templatesimpleandroidapp.manager.screen.command.ScreenCommand;
import leduyhung.me.templatesimpleandroidapp.utils.debug.DebugUtil;

public class ScreenManager {

    private static ScreenManager instance;
    private HashMap<Class, ScreenObserver> lstScreenObserver;

    public static ScreenManager getInstance() {
        if (instance == null)
            instance = new ScreenManager();
        return instance;
    }

    private ScreenManager() {
        lstScreenObserver = new HashMap<>();
    }

    public void sendActionTo(Class classDestination, ScreenCommand command) {
        ScreenObserver ob = lstScreenObserver.get(classDestination);
        if (ob != null)
            ob.onActionReceive(command);
        else {
            DebugUtil.getInstance().chooseDebugType(DebugUtil.DEBUG_TYPE.LOG)
                    .printDebugMessage(this, "sendActionTo fail, not found observer with class "
                            + classDestination.getName());
        }
    }

    public void register(Class classObserver, ScreenObserver observer) {
        if (observer == null) {
            DebugUtil.getInstance().chooseDebugType(DebugUtil.DEBUG_TYPE.LOG)
                    .printDebugMessage(this, "register "
                            + classObserver.getSimpleName() + " is not instance of ScreenObserver. Skip !");
            return;
        }

        if (!lstScreenObserver.containsKey(classObserver))
            lstScreenObserver.put(classObserver, observer);
        else {
            unRegister(classObserver);
            register(classObserver, observer);
        }
    }

    public void unRegister(Class classObserver) {
        DebugUtil.getInstance().chooseDebugType(DebugUtil.DEBUG_TYPE.LOG)
                .printDebugMessage(this, "unRegister class" + classObserver.getSimpleName());
        lstScreenObserver.remove(classObserver);
    }
}
