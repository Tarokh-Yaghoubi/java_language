package generics;

import javax.imageio.spi.ImageTranscoderSpi;
import javax.management.ObjectName;
import java.sql.SQLOutput;
import java.util.Objects;

public class GenericDemo<T> {

    T ob;
    GenericDemo(T o) {
        ob = o;
    }

    T getOb() {
        return this.ob;
    }

    void showType() {
        System.out.println("Type of T IS -> " + ob.getClass().getName());
    }
}

class GenericNumberManip<T> {
    private T firstT;
    private T secondT;

    public GenericNumberManip(T firstT, T secondT) {
        this.firstT = firstT;
        this.secondT = secondT;
    }

    public T getFirstT() {
        return this.firstT;
    }

    public T getSecondT() {
        return this.secondT;
    }

    void getType() {
        System.out.println(this.firstT.getClass().getName());
    }
}

// Non-Generic Class so you'll understand the difference between Generic Class and Implementing the same thing using Object
class NonGen {
    Object ob;

    NonGen(Object o) {
        this.ob = o;
    }

    Object getOb() {
        return this.ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}

class GenNumberManipDemo {

    public static void main(String[] args) {
        NonGen nonGen = new NonGen(10);
        var number = (Integer)nonGen.getOb();   // The cast is necessary here cause we're not using the Generic Class
        GenericNumberManip<Integer> genNumberObj = new GenericNumberManip<>(10, 12);
        System.out.println(genNumberObj.getFirstT());
        System.out.println(genNumberObj.getSecondT());
        var first = genNumberObj.getFirstT();
        var second = genNumberObj.getSecondT();

        System.out.println(first + second);
        genNumberObj.getType();

        GenericNumberManip<String> genStringObj = new GenericNumberManip<>("tarokh", "someone_else");
        System.out.println(genStringObj.getFirstT());
        System.out.println(genStringObj.getSecondT());
        genStringObj.getType();
    }

}