package Interfaces.myTube;

public interface CanSendEmail {

    // We have some features in Interfaces in Java+8 that we should avoid using
    // Unless we fully understand what we are about to do
    // 1 - we can declare fields in Interfaces (They are always public, static, and final (u cannot change the value))

    float something = 23; // this is public, and final

    // 2 - the ability to define static methods in interfaces.

    // 3 - Java 9 -> The ability to implement private methods in an interface.

    void sendEmail(User user);
}
