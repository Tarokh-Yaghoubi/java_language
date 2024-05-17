
public class Input {
    public static void main(String[] args) {
        int num;     // this declares a variable called "num"
        int a, v, b;
        a = v = b = 34;

        char character1 = 'a';
        boolean isActive = true;
        
        num = 100;   // this assigns num the value 100
        System.out.println("This is the value of num ---->>> " + num);

        num *= 2;
        System.out.print("The value of num * 2 is --->>> ");
        System.out.println(num);

        boolean isJava = true;

        int i = 1;
        while (i <= 10) {
            if (isJava) {
                System.out.println("Java is a good language " + i);
                isJava = false;
            } else if (isJava != true) {
                System.out.println("Java is not a good language - It's a great language " + i);
                isJava = true;
            }
            ++i;
        }

    }
}

class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (y > x) System.out.println("Y is greater than X");
        else if (y < x) System.out.println("Y is not greater than X");
        x *= 2;
        if (x == y) System.out.println("Y is equal to X");
        else System.out.println("Y is not equal to X");
    }
}
