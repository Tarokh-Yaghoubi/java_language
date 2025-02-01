
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mortgage.mortgageCalculator();

    }

    // String[] args -> declares a parameter named args, which is an array of instances of the class String.
    // Arrays are collections of similar objects.

    // main() is simply a starting point for your program, a program may have dozens of classes by only one main in one of those classes.
    // Furthermore, for some types of programs, you won't need main() at all, However for most programs, main is required.

    // Console I/O is not used frequently in most real-world java applications

    private static void sum(int a, int n) {
        System.out.println(a + n);
    }

    // A "class" defines the structure and behavior (data and code)  that will be shared by a set of objects.
    // Each object of a given class contains the structure and behavior defined by the class, that is why
    // sometimes objects are called "Instances of a class".

    // When you create a class you will specify the code and data that constitute that class.
    // These elements are called members of the class.
    // The data defined by the class are called member variables, or instance variables.
    // The code that operates on that data is called member methods, or just "methods".

    // What a Java programmer calls a Method, A C programmer calls a Function.

    // In properly written Java programs the methods define how the member variables can be used.

    // Each method or variable in a class can be called "private" or "public".
    // The "public" interface of a class represents everything that external users of the class need to know, or may know.
    // The "private" methods and data can only be accessed by code that is a member of the class, Therefor any other code
    // that is not a member of the class cannot access a private method or variable.
    // ENCAPSULATION: Public methods can be used to protect private data.

    // INHERITANCE: is the process by which one object acquires the properties of another object.

    // If you want to describe a more specific class of animals, such as wolves, they would have more specific attributes, such
    // type of teeth, and color of eyes. This is known as "subclass" of animals, where animals are referred to as wolves "superclass".

    // Since wolves are simply more precisely specified animals, they inherit all the attributes of animals.

    // NOTE: A deeply inherited subclass inherits all the attributes from each of its ancestors in the "class hierarchy"


}

