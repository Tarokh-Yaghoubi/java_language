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
        Arrays arr = new Arrays();
        arr.main(null);
    }
}

class Arrays {
    public static void main(String[] args) {
        // An array is a group of like-type variables that are referred to by a common name.
        int[] numbers;
        numbers = new int[4];
        int[] otherNumbers = new int[10];   // this also another type of declaring an array
        otherNumbers = null;

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 7;
        numbers[3] = 9;

        for (int number : numbers) {
            System.out.println("Numbers of numbers array --->>>> " + number);
        }
        System.out.println("numbers second index is ----->>>> " + numbers[1]);
        // finding the length of the array using the length property
        System.out.println("length of the array is ---->>>> " + numbers.length);

        // we call this 'array initializer',
        // The array will automatically be created large enough to hold the number of elements you specify in the
        // array initializer.

        String[] names = {"Tarokh", "Jacob", "Tommy", "Robin", "Jason"};
        System.out.println("names second index is ----->>>> " + names[1]);
        System.out.println("names first index is ----->>>> " + names[0]);

        // Array of arrays -> Multi-dimensional arrays.
        int[][] multiArray = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                multiArray[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        TypeInference typeInference = new TypeInference();
        typeInference.main(null);
    }
}

class   TypeInference {
    public static void main(String[] args) {
        double first_number = 89.3;
        double second_number = 4.4;
        var avg = first_number / second_number;

        System.out.println("Average of first and second number is ---->> " + avg);
        // var, can be a user-defined identifier which has no specific meaning,

        // In the following context, var is not a pre-defined identifier,
        // but a user-defined defined variable name.
        String var = "This is a user-defined string which is assigned to 'var' ";
        System.out.println("Here var IS ------>> " + var);
        // btw, "var" cannot be the name of a class.
        // you can use var to declare an array like this:
        var myArr = new int[10];    // this is valid
        // attention -> you cannot use brackets in a var-declaration.

        // var is only valid in a variable declaration when the variable is initialized
        // in the declaration
        // this is wrong ->         var myName; // this is not initialized in the declaration
        // a variable cannot use null as its initializer
        // var cannot be used with an array-initializer
        // var cannot be used as the name of the class
        // It cannot be used as the name of other reference types as well
        // such as annotations, enumerations and interfaces.
        // In java, a String is not defined as a string of characters like some other languages
        // such as C. But it is an objects, which has a rich set of methods that can be used on that
        // string object.
        System.out.println("----------------------------------------");
        testingOperatorClass();

    }

    public static void testingOperatorClass() {
        Operands objOperands = new Operands();
        objOperands.main(null);
    }
}

class Operands {
    public static void main(String[] args) {
        testJavaOperands();
        testBitwiseOperands();
        testTernaryOperator();
    }

    public static void testJavaOperands() {
        System.out.println("testing operands in Java programming language");
        // You cannot use arithmetic operators on non-numeral types.
        // like boolean, btw you can use them on 'char' types, since the char type
        // in Java is essentially, a subset of "int".

        int a =  1 + 1;
        int b = a * 3;
        int c  = b / 4;
        int d = c - a;
        int e = -d; // unary minus operator, it negates the value of d.
        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        System.out.println("c =  " + c);
        System.out.println("d =  " + d);
        System.out.println("e =  " + e);

        // arithmetic using doubles

        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }

    public static void testBitwiseOperands() {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b)|(a & ~b);
        int g = ~a & 0x0f;

        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a|b = " + binary[c]);
        System.out.println(" a&b = " + binary[d]);
        System.out.println(" a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println(" ~a = " + binary[g]);
    }

    public static void testTernaryOperator() {
        Ternary ternary = new Ternary();
        ternary.main(null);

    }
}

class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
        i = -10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}

