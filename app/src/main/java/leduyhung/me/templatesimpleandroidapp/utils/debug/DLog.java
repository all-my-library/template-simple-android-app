package leduyhung.me.templatesimpleandroidapp.utils.debug;

import android.util.Log;

public class DLog extends Debug{
    @Override
    public void printLog(String tag, String message) {
        Log.d(DEBUG_TAG, tag + ":  " + message);
    }
}
