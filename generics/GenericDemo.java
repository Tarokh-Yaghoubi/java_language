package generics;

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
