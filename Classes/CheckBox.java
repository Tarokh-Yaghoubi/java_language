package Classes;

import Inheritance.UIControl;

public class CheckBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render CheckBox -> ");
    }
}

class CheckBoxDemo {
    public static void main(String[] args) {
        UIControl[] controls = { new TextBox(), new CheckBox() };
        // each control object is getting a different render methods
        // we call it polymorphism.
        for (var control : controls) {
            control.render();
        }
    }
}
