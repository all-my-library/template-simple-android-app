package leduyhung.me.templatesimpleandroidapp.ui;

import android.app.Activity;

import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenManager;
import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenObserver;

public abstract class BaseActivity extends Activity {

    @Override
    protected void onResume() {
        super.onResume();
        ScreenManager.getInstance().register(this.getClass(), (this instanceof ScreenObserver) ? (ScreenObserver) this : null);
    }

    @Override
    protected void onStop() {
        super.onStop();
        ScreenManager.getInstance().unRegister(this.getClass());
    }
}
