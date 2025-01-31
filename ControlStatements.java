package java_language;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        LabeledBreak labels = new LabeledBreak();
        labels.main(null);

        ForEach foreachObj2 = new ForEach();
        foreachObj2.main(null);

        ContinueKeyword continueKeyObj = new ContinueKeyword();
        continueKeyObj.main(null);
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

class LabeledBreak {
    public static void main(String[] args) {
        labeledBreaks();
    }

    public static void labeledBreaks() {
        boolean t = true;

        first: {
            second: {
                third:{
                    System.out.println("Before the break");
                    if (t) break second;
                    System.out.println("this will not execute");
                }
                System.out.println("this will not execute");
            }
            System.out.println("this is not in the second block");
        }
    }
}

class ForEach {
    public static void main(String[] args) {
        forEachTest();
        List<String> myList = new ArrayList<String>();

        myList = forEachSearch();
        System.out.println("The list of results is ----<>>> " + myList);
    }

    public static void forEachTest() {
        int sum = 0;
        int [][] nums = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // use for-each for to display and sum the values

        for (int[] x : nums) {
            for (int y : x) {
                System.out.print(y + " ");
                sum += y;
            }
        }

        System.out.println("Summation is ---->>> " + sum);
    }

    public static @NotNull List<String> forEachSearch() {
        int[] nums = {1, 3, 54, 12, 10, 25, 26, 28, 65, 34, 16};
        List<String> list = new ArrayList<String>();    // parenthesis are for initialization capacity
        int count = 0;
        boolean found = false;

        for (int x : nums) {
            if (x == 26) {
                found = true;
                list.add("true");
                String counter = Integer.toString(count);
                list.add(counter);
                return list;
            }
            count++;
        }

        // type inference could be used inside the for-each for loops,
        // like this:
        // for (var v : numbers) { // do something; }

        return list;
    }
}

class ContinueKeyword {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        list = createAnotherList();
        System.out.println(list);
    }

    public static @NotNull List<Integer> createAnotherList() {
        List<Integer> list = new ArrayList<Integer>(5);
        List<Integer> finalList = new ArrayList<Integer>();
        Collections.addAll(list, 66, 17, 28, 48, 65);
        for (var v : list) {
            if (v != 28) finalList.add(v);
            else continue;
            // when the loop meets the value 28, it will append it to the list.
        }
        return finalList;
    }
}
