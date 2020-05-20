package leduyhung.me.templatesimpleandroidapp.ui;

import android.app.Activity;

import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenManager;
import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenObserver;

public abstract class BaseActivity extends Activity {

    @Override
    protected void onResume() {
        super.onResume();
        ScreenManager.getInstance().register(getClassListener(), getScreenObserver());
    }

    @Override
    protected void onStop() {
        super.onStop();
        ScreenManager.getInstance().unRegister(getClassListener());
    }

    protected abstract ScreenObserver getScreenObserver();
    protected abstract Class getClassListener();
}
