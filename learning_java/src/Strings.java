public class Strings {
    String name = "tarokh";

    void echo() {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}

class StringsDemo {

    static Strings str = new Strings();
    public static void main(String[] args) {
        str.echo();
        boolean ans = testEquality();
        System.out.println("The answer of test equality is -> " + ans);
    }

    static boolean testEquality() {
        return str.name.equals("taro--kh");
    }
}

