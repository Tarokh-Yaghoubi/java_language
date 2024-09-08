
import org.jetbrains.annotations.*;

public class Override {
    public static void main(String[] args) {
        final var secondObj = new SecondClass(25, 25, 36);
        secondObj.show();

        final var thirdObj = new ThirdClass(45, 65, 23, "192.168.0.0");
        thirdObj.show();

    }
}

class FirstClass {
    int i, j;
    FirstClass(int a, int b) {
        i = a;
        j = b;
    }

    void show () {
        System.out.println("FirstClass i and j -> " + i + "  " + j);
    }
}

class SecondClass extends FirstClass {
    int k;

    SecondClass (int i , int j , int k) {
        super(i ,j);
        this.k = k;
    }

    // This will override "show" in class: FirstClass
    @java.lang.Override
    void show() {
        System.out.println("SecData -> " + super.i + " " + super.j + " " + this.k);
    }
}

class ThirdClass extends SecondClass {
    String ip_address;

    ThirdClass(int i, int j, int k, String data) {
        super(i, j, k);
        this.ip_address = data;
    }

    @java.lang.Override
    void show() {
        System.out.println("Data -> " + super.i + " " + super.j + " " + this.ip_address);
    }

}

