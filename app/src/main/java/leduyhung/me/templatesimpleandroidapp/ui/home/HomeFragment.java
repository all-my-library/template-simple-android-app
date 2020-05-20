package leduyhung.me.templatesimpleandroidapp.ui.home;

import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenObserver;
import leduyhung.me.templatesimpleandroidapp.manager.screen.command.HomeFragmentCommand;
import leduyhung.me.templatesimpleandroidapp.manager.screen.command.ScreenCommand;
import leduyhung.me.templatesimpleandroidapp.ui.BaseFragment;

public class HomeFragment extends BaseFragment implements ScreenObserver {

    @Override
    protected int onCreateLayout() {
        return 0;
    }

    @Override
    protected ScreenObserver getScreenObserver() {
        return this;
    }

    @Override
    protected Class getClassListener() {
        return this.getClass();
    }

    @Override
    public void onActionReceive(ScreenCommand command) {
        String action = command.getAction();
        switch (action) {
            case HomeFragmentCommand
                    .ACTION_BACK:
                break;
            default:
        }
    }
}
