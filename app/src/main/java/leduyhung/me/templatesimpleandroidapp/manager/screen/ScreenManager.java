package leduyhung.me.templatesimpleandroidapp.manager.screen;

import java.util.HashMap;

import leduyhung.me.templatesimpleandroidapp.manager.screen.command.ScreenCommand;

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
            // TODO: Log the key contain null value
        }
    }

    public void register(Class classObserver, ScreenObserver observer) {
        if (!lstScreenObserver.containsKey(classObserver))
            lstScreenObserver.put(classObserver, observer);
        else {
            unRegister(classObserver);
            register(classObserver, observer);
        }
    }

    public void unRegister(Class classObserver) {
        lstScreenObserver.remove(classObserver);
    }
}
