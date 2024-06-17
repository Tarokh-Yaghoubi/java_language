package java_language.Classes;

import java.util.Locale;

public class introduction_to_classes {
    // a class defines a new data type
    // thus a class is a template for an object, and an object is an instance of a class
    // object == instance

    // Java classes do not need to have a main method
    // Only the class that is the entry point of the JAVA program needs to have a main method
    // some kinds of Java applications do not require

    // the 'new' operator dynamically allocates memory for an object

    // The class name followed by the parentheses specifies the constructor of the class
    // A constructor defines what occurs when an object of a class is created.

    // Most of real-world java classes define their own constructor. If you do not define a constructor
    // the default constructor will be used.

    public static void main(String[] args) {
        BoxDemo boxDemo;    // declare reference to object
        BoxDemo boxDemo2;
        boxDemo = new BoxDemo();    // allocate a Box object
        boxDemo2 = boxDemo; // now this two both refer to the same object
        boxDemo = null; // here, boxDemo is set to null, but boxDemo2 is still pointing to that object
        boxDemo2.boxTest();      // call the BoxDemp method

        System.out.println("--------------------------");
        Programmer programmer_one = new Programmer(20, "Tarokh", "C programming lang", true);
        programmer_one.echo();
        programmer_one.resetVal(23, "Jamy", "Kotlin", false);

    }
}


class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Volume: ");
        System.out.println(width * height * depth);
    }

    int square(int i) {
        // returning the square of 'i'
        return i * i;
    }
}

class BoxDemo {
    public static void boxTest() {
        Box box = new Box();
        double vol;

        box.width = 10;
        box.height = 20;
        box.depth = 15;

        vol = box.width * box.height * box.depth;
        System.out.println("Box vol is ------>>" + vol);
    }
}

class Programmer {
    int age;
    String name;
    String programming_language;
    boolean isCoding;

    Programmer(int age, String name, String programming_language, boolean isCoding) {
        this.age = age;
        this.name = name;
        this.programming_language = programming_language;
        this.isCoding = isCoding;
    }

    void echo() {
        System.out.println(name + " is " + programming_language + " developer and " + age + " years old.");
    }

    void resetVal(int age, String name, String programming_language, boolean isCoding) {
        this.age = age;
        this.name = name;
        this.programming_language = programming_language;
        this.isCoding = isCoding;
        echo();
    }
}