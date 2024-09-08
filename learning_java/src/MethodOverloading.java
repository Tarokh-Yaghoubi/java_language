import org.jetbrains.annotations.NotNull;

public class MethodOverloading {
    int first;
    int second;

    MethodOverloading(int first, int second) {
        this.first = first;
        this.second = second;
    }

    MethodOverloading() {
        this.first = 10;
        this.second = 20;
    }

    /**
     * Overloading: Methods can have the same name but with different parameters
     * This is one of the ways that Java supports Polymorphism.
     * @return
     */

    int sum() {
        return this.first + this.second;
    }

    int sum(int extra) {
        return this.first + this.second + extra;
    }

    boolean isLarge(@NotNull MethodOverloading O) {
        return O.sum() > 20;
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading overload =  new MethodOverloading(22, 33);
        MethodOverloading overload1 =  new MethodOverloading();
        PassByObj reference =  new PassByObj();

        System.out.println(overload.sum());
        System.out.println(overload.sum(10));

        System.out.println(overload1.sum());
        System.out.println(overload1.sum(10));

        System.out.println(overload.isLarge(overload));

        reference.testReference();

    }
}


class Test {
    int a, b;

    Test(int i , int j) {
        a = i;
        b = j;
    }

    void meth(@NotNull Test o) {
        o.a *= 2;
        o.b /= 2;
    }

}

class PassByObj {
    void testReference() {
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);

    }
}

