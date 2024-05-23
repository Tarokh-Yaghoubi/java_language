package java_language;

public class MoreOnLiterals {
    public static void main(String[] args) {
        // this is a binary number
        int x = 0b1010; // this specifies the decimal value 10 using a binary literal
        int one = 0b0001;
        int zero = 0b0000;

        System.out.println("one AND with zero is ---->>> " +  (one & zero));
        // you can use underscores to separate numbers in Java, and the Java language will discard them in compile time
        long  number = 234_123_982; // this is a valid way to present a number in Java.
        // even you can add more underscores, and Java will discard them all at compile time
        System.out.println("number is ---->>> " + number);
        double doublyNum = 13246351.164631D;
        float  floatyNum = 968676541.243F;
        double hexaDecFloat = 0x12.2P2; // this is also supported, but it is rarely used

        System.out.println("floatyNum is ---->>> " + floatyNum);
        System.out.println("doubleyNum is ---->>> " + doublyNum);
        System.out.println(true != false);

        // In Java, neither True nor False are equal to zero or one
        // They can not be compared with integer values

        // In Java, we can represent characters using Octal Notation.
        System.out.println('\141'); // this is letter 'a'
        // Also this is the HexaDecimal form:
        System.out.println('\u0061');   // This the ISO-Latin-1 letter 'a'
        System.out.println('\ua432');   // this is a Japanese Katakana character
        /*
                \r -> Carriage Return
                \n -> New Line
                \f -> Form feed
                \t -> Tab
                \b -> BackSpace
                \s -> Space (Added by JDK 15)
         */

        String firstname = "Tarokh is my first name";
        // In Java, a string must be in a single-line, multiple-line string is not supported
        // like some other languages
        System.out.println("Value of my string literal ---->>>>> " + firstname);
        // In some languages Strings are Array of characters.
        // But this is not the case in Java.
        // Strings, are actually object types, because Java implements strings as objects.
        DynamicVariableInit dvi = new DynamicVariableInit();
        LifeTime lifetime = new LifeTime();
        dvi.rightTriangleCalc();
        lifetime.variableLifeTime();

        // 1 - Block of code in a method is called "The Method Body"
        // 2 -  A variable declared within a block is called "local variable"
        // 3 - If the scopes are nested, the objects in the outer scope are visible to the inner scope
        // but the reverse is not true
        // 4 - The Scope rules, provide the foundation for "ENCAPSULATION"
    }
}

class DynamicVariableInit {

    public static void main() {
        rightTriangleCalc();
    }
    public static void rightTriangleCalc() {
        // a and b are initialized by constants
        double a = 3.0, b = 4.0;
        // variable 'c' is dynamically initialized
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse is ---->>> " + c);
    }
}

class LifeTime {
    public static void main(String[] args) {
        variableLifeTime();
    }

    public static void variableLifeTime() {
        int x;
        for (x = 0; x < 4; x++) {
            int y = -1;
            System.out.println("y is --->>> " + y); // this always prints -1
            y = 100;
            int first = 234;
            float second = (float)first;
            System.out.println("second is ---->>> " + second);
            System.out.println("y is now --->>> " + y);
        }

        byte someByte = 126;
        // this is possible. because "int" is large enough to hold all data of a "byte" value.
        int holdingByteVal = someByte;
        System.out.println("holdingByteVal is ---->>> " + holdingByteVal);

        // Narrowing Conversions are not done automatically in Java.
        // You have to do it yourself, because you are going to face data lose in this type
        // of conversion.
        // when a float assigns to an Integer type, truncation happens.
    }
}
