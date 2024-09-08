
public class SupperClass {

    public static void main(String[] args) {
        final var subObj = new SubClass(43, 54);
        subObj.show();
    }
}

class SuperClassTest {
    int i;

    void show() {
        System.out.println("I is -> " + this.i);
    }
}


class SubClass extends SuperClassTest {
    int i;

    SubClass(int a, int b) {
        super.i = a;    // i in SuperClass
        this.i = b;     // i in SubClass (here)
    }

    void show() {
        System.out.println("I in super class -> "  + super.i);
        System.out.println("I in sub class (here) -> " + this.i);
    }

}
