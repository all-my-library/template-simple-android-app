package leduyhung.me.templatesimpleandroidapp.utils.debug;

import android.util.Log;

public class DebugUtil {

    public enum DEBUG_TYPE {LOG, FILE}

    private static DebugUtil instance;
    private Debug debug;

    public static DebugUtil getInstance() {
        if (instance == null)
            instance = new DebugUtil();
        return instance;
    }

    public DebugUtil chooseDebugType(DEBUG_TYPE type) {
        if (instance == null)
            throw new RuntimeException("Must call DebugUtil.getInstance() first !");
        switch (type) {
            case LOG:
                debug = new DLog();
                break;
            case FILE:
                debug = new DFile();
                break;
        }
        return instance;
    }

    public void printDebugMessage(Object o, String message) {
        debug.printLog(o.getClass().getName(), message);
    }

    public void clearInstance() {
        instance = null;
    }
}
