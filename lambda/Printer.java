package lambda;

public interface Printer {
    // As long as we have a single abstract method in our interface
    // we call that interface a "functional interface"

    void print(String message);

    default void printTwice(String message) {
        System.out.println(message);
        System.out.println(message);
    }
}
