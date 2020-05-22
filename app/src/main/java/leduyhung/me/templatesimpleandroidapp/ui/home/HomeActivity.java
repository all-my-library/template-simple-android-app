package leduyhung.me.templatesimpleandroidapp.ui.home;

import leduyhung.me.templatesimpleandroidapp.R;

import leduyhung.me.templatesimpleandroidapp.manager.screen.command.HomeActivityCommand;
import leduyhung.me.templatesimpleandroidapp.manager.screen.command.ScreenCommand;
import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenObserver;
import leduyhung.me.templatesimpleandroidapp.ui.BaseActivity;

import android.os.Bundle;

public class HomeActivity extends BaseActivity implements ScreenObserver {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void onActionReceive(ScreenCommand command) {
        String action = command.getAction();
        switch (action) {
            case HomeActivityCommand
                    .ACTION_BACK:
                break;
            case HomeActivityCommand.ACTION_ADD_HOME_FRAGMENT:
                break;
            default:
        }
    }
}
