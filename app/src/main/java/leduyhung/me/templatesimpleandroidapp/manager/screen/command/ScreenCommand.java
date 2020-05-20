package leduyhung.me.templatesimpleandroidapp.manager.screen.command;

public abstract class ScreenCommand {

    public static final String ACTION_BACK = "ACTION_BACK";

    String action;
    Object data;

    public String getAction() {
        return action;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setActionBack() {
        this.action = ACTION_BACK;
    }
}
