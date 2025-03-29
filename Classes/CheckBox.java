package Classes;

import Inheritance.UIControl;

import java.util.HashMap;

// We can implement this interface using a class or many other classes
// depending on the usage
// a class can implement many interfaces
// this is a modern way of Abstraction and Polymorphism
// We can reach Abstraction and Polymorphism using interfaces
// You cannot implement methods inside interfaces and you should just override them in
// the specified class.
// In Java 8+ we can use 'default' to implement a default implementation for the method.

interface Payments {
    default public void fuck() {
        System.out.printf("asd");
    }

    // we override these methods in the specified classes.
    public void sendTrans();
    public void getTrans();
    public void createMessage();
}

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

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("merchantName", "TarokhGroup");
        map.put("merchantId", "23530495830495");
        map.put("pan", "523321546545210");
        var payment = new Payment(map);
        payment.sendData();


    }
}

class TBank extends Payment {

    // Now here I can call setHashMapData to set the fields
    // And then I can override the sendData to send it as I prefer
    // Like sending it to another destination or whatever else
    @Override
    public void sendData() {

    }

}
