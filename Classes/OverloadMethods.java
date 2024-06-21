package java_language.Classes;

// Method overloading is one of the ways that Java supports Polymorphism
// in method overloading methods can have same names but with different parameters

public class OverloadMethods {
    OverloadMethods() {
        System.out.println("OverloadMethods");
    }

    void test() {
        System.out.println("test method in java - not overloaded yet");
    }

    void test(int x) {
        System.out.println("test method in java - overloaded version - val of x --->> " + x);
    }

    int test(String name) {
        System.out.println("test method. overloaded, value of String ---->>> " + name);
        return 0;
    }

}

// This is how overloading works
/*
 *    Method overloading supports polymorphism because it is one way that Java implements
 *    the “one interface, multiple methods” paradigm.
 */

class OverloadTest {
    public static void main(String[] args) {
        OverloadMethods overload = new OverloadMethods();
        overload.test();
        overload.test(2);
        overload.test("Jimmy");
    }
}

