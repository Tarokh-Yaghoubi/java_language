package hackerrank;

import java.util.Scanner;

public class Padding {

    public void print(String s1, int x) {
        int lenStr = s1.length();
        String num = "";
        for (int i = 0; i < 15 - lenStr; ++i) s1 += " ";
        num += x;
        if (num.length() < 3) {
            if (num.length() == 2)
                num = "0" + num;
            else if (num.length() == 1)
                num = "00" + num;
        }
        System.out.println(s1 + num);
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            //Complete this line
            print(s1, x);
        }

        System.out.println("================================");
    }
}

class PaddingDemo {
    public static void main(String[] args) {
        var padding = new Padding();
        padding.show();
    }
}
