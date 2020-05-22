package leduyhung.me.templatesimpleandroidapp.utils.debug;

public abstract class Debug {

    static final String DEBUG_TAG = "DEBUG_MODE";

    public Debug() {
    }

    public abstract void printLog(String tag,String message);
}
