public class DynamicMethodDispatch {
    public static void main(String[] args) {

        FirstSuperClass firstSuperobj = new FirstSuperClass(21, 23);
        SecondSubClass secondSubClass = new SecondSubClass(25, 26, 29);

        FirstSuperClass reference;
        reference = firstSuperobj;
        reference.show();
        reference = secondSubClass;
        reference.show();
        reference = firstSuperobj;
        reference.show();

    }
}

class FirstSuperClass {
    int a, b;
    FirstSuperClass(int first, int second) {
        this.a = first;
        this.b = second;
    }

    void show() {
        System.out.println("Value of a and b -> " + a + " " + b);
    }
}

class SecondSubClass extends FirstSuperClass {
    int c;
    SecondSubClass(int first, int second, int third) {
        super(first, second);
        this.c = third;
    }

    @java.lang.Override
    void show() {
        System.out.println("Value of a , b and C -> " + a + " " + b + " " + c);
    }

}
