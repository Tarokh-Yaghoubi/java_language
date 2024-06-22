package java_language.Classes;

public class ArgumentPassing {
    int a, b;
    ArgumentPassing(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void meth(ArgumentPassing o) {
        o.a *= 2;
        o.b /= 2;
    }
}

// When an object reference is passed to a method, the reference itself is passed by use of call-by-value
// However, since the value being passed refers to an object , the copy of that value will still refer to the same
// object.

class PassObjReference {
    public static void main(String[] args) {
        ArgumentPassing x = new ArgumentPassing(12, 34);
        System.out.println("X.a and X.b before passing by references are  : " + x.a + " x.b is -->>> " + x.b);
        x.meth(x);
        System.out.println("X.a and X.b after passing as references are : " + x.a + " x.b is -->>> " + x.b);
    }
}
