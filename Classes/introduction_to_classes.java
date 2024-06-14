package java_language.Classes;

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
        boxDemo = new BoxDemo();    // allocate a Box object
        boxDemo.boxTest();      // call the BoxDemp method

    }
}


class Box {
    double width;
    double height;
    double depth;
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