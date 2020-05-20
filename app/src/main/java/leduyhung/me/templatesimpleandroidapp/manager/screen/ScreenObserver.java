package leduyhung.me.templatesimpleandroidapp.manager.screen;

import leduyhung.me.templatesimpleandroidapp.manager.screen.command.ScreenCommand;

public interface ScreenObserver {
    void onActionReceive(ScreenCommand command);
}
