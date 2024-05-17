public class AreaOfCircle {
    public static void main(String[] args) {
        double pi, radius, a;
        pi = 3.14;
        radius = 10.8;
        a = pi * radius * radius;   // complete area
        System.out.println("The area of a circle is " + a);
        charDemo();
        BoolTest testBool = new BoolTest();
        testBool.checkBoolean();

    }

    public static void charDemo() {
        char ch1, ch2;
        ch1 = 'A';
        ch2 = 88;
        System.out.print("ch1 and ch2 : ");
        System.out.println(ch1 + " " + ch2);

    }


}

class BoolTest {
    public static void main(String[] args) {
        checkBoolean();
    }
    public static void checkBoolean() {

        boolean isSeven = false;
        int number = 0;
        while (number != 7) {
            number++;
            System.out.println("number is " + number);
        }
        isSeven = true;
        System.out.println("isSeven = " + isSeven);
        System.out.println("number is ---->>> " + number);
        System.out.println("Java" == "Java");   // this results in true
    }
}
