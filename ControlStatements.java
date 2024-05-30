package java_language;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ControlStatements {
    public static void main(String[] args) {
        // Control Statements in the Java programming language
        boolean isActive = true;
        if (isActive)
            sendData();
        else
            waitMore();

        // note that only one statement can be placed directly after if-else
        // if more statements are required,you are going to need to create blocks of code
        // {}
        forLoop loop = new forLoop();
        forLoop.main(null);

        forEachVersion foreachObj = new forEachVersion();
        foreachObj.main(null);

        NestedForLoops nestedObj = new NestedForLoops();
        nestedObj.main(null);
    }

    public static void sendData() {
        System.out.println("Sending data");
    }

    public static void waitMore() {
        System.out.println("Waiting for data");
    }
}

class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "trash";
        }

        System.out.println("Season is ---->>> : " + season);

    }
}

class forLoop {
    public static void main(String[] args) {
        boolean done = false;
        int x = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                done = true;
                System.out.println("Done is true now " + i);
                break;
            }
            System.out.println("Done is still false " + i);
        }

        //  another for-loop variant
        System.out.println("-----------------SECOND LOOP----------------");
        for (; done; ) {
            if (x == 6) {
                done = false;
                System.out.println("Done is false now " + x);
                break;
            }
            System.out.println("Done is true now " + x);
            x++;
        }

        // a loop that never terminates -> for ( ; ; ) { STATEMENTS }
    }
}

class forEachVersion {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sumOfNums = sum(numbers);
        System.out.println("Sum of numbers is " + sumOfNums);
    }

    // this function calculates the sum of the array numbers and return the sum
    public static int sum(int @NotNull [] numbers) {
        int sum = 0;
        for (int i : numbers) sum += i;
        return sum;
    }
}


class NestedForLoops {
    public static void main(String[] args) {
        printSquare();
    }

    public static void printSquare() {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(" . ");
            }
            System.out.println();
        }
    }
}
