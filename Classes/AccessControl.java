package java_language.Classes;

public class AccessControl {

    static char chr;
    int num;
    public static void main() {
        chr = 23;
        System.out.println(chr);
        // this is wrong, because a static context can only access static variables
        // num = 23;
    }
}

class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
        UseStatic.meth(48);
    }
}
