package exceptions;

import org.jetbrains.annotations.NotNull;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {

        // This is what we call try-with-resources
        // there is no need for finally block in this way

        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
        ) {
            new SimpleDateFormat().parse("");
            System.out.println("File Opened");
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }   // we can use the pipe | to treat all exceptions the same way
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) { // test
//                    System.out.println(e.getMessage());
//                }
//            }
//        }

    }

    public static void sayHello(@NotNull String name) {
        System.out.println(name.toUpperCase());
    }
}


class TestExceptions {
    public static void main(String[] args) {
        ExceptionsDemo.show();
    }
}