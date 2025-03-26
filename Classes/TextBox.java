package Classes;

import Inheritance.UIControl;

public class TextBox extends UIControl {
    private String text = " ";

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox constructor");
//    }

    @Override
    public void render() {
        System.out.println("Render TextBox -> ");
    }
    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    @Override
    public String toString() {
        return text;
    }

}
