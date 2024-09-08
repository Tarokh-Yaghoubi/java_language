public class OuterClass {
    final int x = 12;

    class InnerClass {
        void saySomething() {
            System.out.println("outer x is -> " + x);
        }
    }

    void echo() {
        for (int i = 0; i < 10; ++i) {
            InnerClass inner = new InnerClass();
            inner.saySomething();
        }
    }
}

class OuterClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.echo();
    }
}
