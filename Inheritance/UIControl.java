package Inheritance;

import Classes.TextBox;

public class UIControl {
    private boolean isEnabled = false;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;

        System.out.println("UI Control constructor");
    }

    public void enable() {
        this.isEnabled = true;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}

class TestUIControl {
    public static void main(String[] args) {
        var control = new TextBox();
        System.out.println(control.hashCode());
        control.enable();
        System.out.println(control.isEnabled());
    }
}
