package Inheritance;

import Classes.TextBox;
import org.w3c.dom.Text;

import java.lang.reflect.AnnotatedType;
import java.sql.SQLOutput;

// we declare this class and the render method as abstract
// because the UIControl class is a base class which we are not going to
// instantiate it at all.

public abstract class UIControl {
    private boolean isEnabled = false;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//
//        System.out.println("UI Control constructor");
//    }

    public abstract void render();

    public void enable() {
        this.isEnabled = true;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    // This is how we can override a method



}

class TestUIControl {
    public static void main(String[] args) {
//        var control = new TextBox();
//        System.out.println(control.hashCode());
//        control.enable();
//        System.out.println(control.isEnabled());
//        System.out.println(control.toString());
//        var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);

    }

    public static void show(UIControl object) {
        // This is what we call down-casting
        if (object instanceof TextBox) {
            var textBox = (TextBox) object;
            textBox.setText("Tarokh is a good man");
        }

        System.out.println(object);
    }
}
