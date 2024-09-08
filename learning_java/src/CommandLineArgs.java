// import org.jetbrains.annotations.NotNull;

import org.jetbrains.annotations.NotNull;

public class CommandLineArgs {
    public static void main(String [] args) {
        if (args.length >= 1) {
            for (int i = 0; i < args.length; ++i) {
                System.out.println("args [" + i + "]: " + args[i]);
            }
        }

        TestVarArgs.testVars("This is a message", 25, 36, 12, 14, 18, 19, 17, 20, 25, 26);
        TestVarArgs.testVars("This is another message ", true, true, false, false);
    }
}

class TestVarArgs {
    static void testVars(String msg, int @NotNull ... varargs) {
        System.out.print(msg + " " + varargs.length + " Contents : ");

        for (int x : varargs) System.out.print(x + " ");

        System.out.println();
     }

    static void testVars(String msg, boolean @NotNull ... varargs) {
        System.out.print(msg + " " + varargs.length + " Contents : ");

        for (boolean x : varargs) System.out.print(x + " ");

        System.out.println();
    }
}