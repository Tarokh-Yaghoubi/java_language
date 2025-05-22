package lambda;

import java.util.List;
import java.util.function.*;

public class LambdaDemo {

    // this is how we can use anonymous inner classes.
    // the newer way is 'lambda expression'

//    public LambdaDemo(String message) {
//
//    }

    public  String prefix = "-";

    // public static void print(String message) {}

    public static void print(String message) {}

    public static void show() {


        // lambda expression:
        // In lambda expressions we cannot have fields.
        // because the lambda expression is only representing an anonymous function. so we cannot have instance fields here,
        // we cannot have state. we can only access the local variable declared in the enclosing object as  well as the static and instance
        // fields in the enclosing class.

        greet(message ->  System.out.println(message) );

        // the same lambda expression using Method references:

        greet(System.out::println);

        // greet(LambdaDemo::print);

        // if the method is an instance method:
//        var demo = new LambdaDemo();
//        greet(demo::print); // this is how it works (method references)

        // greet(LambdaDemo::new); // this is how it works with constructor.

        // we can also store a lambda expression in a variable

        Printer printer = message -> System.out.println(message);

        // BuiltIn Functional Interfaces in Java:
        // -> Consumer Interface : void consume(obj);
        // -> Supplier Interface : obj supply();
        // -> Function Interface : obj map(obj);
        // -> Predicate Interface : bool test(condition);

        // Anonymous inner classes
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        // The Consumer Interface:

        List<Integer> list = List.of(1, 2, 3);

        // Imperative programming
        for (var item : list)
            System.out.println(item);

        // Declarative programming
        list.forEach(item -> System.out.println(item));

        List<String> strList = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        strList.forEach(print.andThen(printUpperCase).andThen(print));

        // Supplier Interface:
        Supplier<Double> getRandom = () -> Math.random();
        // We call this -> Lazy Evaluation
        var random = getRandom.get();
        System.out.println(random);

        // Function Interface:
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Tarokh");
        System.out.println(length);

        // Compose functions:

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        var result = replaceColon
                    .andThen(addBraces)
                    .apply("key:value");

        // we also have a method called compose

        var sameResult = addBraces.compose(replaceColon).apply("key:value");
        System.out.println(sameResult);

        System.out.println(result);

        // Predicate Interface:
        Predicate<String> isLongerThanFive = str -> str.length() > 5;
        var testResult = isLongerThanFive.test("tarokh");
        System.out.println(testResult);

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        // we can combine this predicates...
        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
        var leftAndRightResult = hasLeftAndRightBraces.test("{tarokh}");
        System.out.println(leftAndRightResult);

        // BinaryOperator Interface:
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;
        var binOpRes = add.andThen(square).apply(10, 11);
        System.out.println(binOpRes);

        // UnaryOperator Interface.
        UnaryOperator<Integer> anotherSquare = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        var unaryResult = increment.andThen(anotherSquare).apply(1);
        System.out.println(unaryResult);


        // Use Case -> Filtering Data -> eg: in Stream.filter()
        Predicate<String> isLong = s -> s.length() > 10;
        System.out.println(isLong.test("tarokh"));

        // Use Case -> Iterating through lists (List.forEach()) uses Consumer
        Consumer<String> shout = s -> System.out.println(s + "!!!");
        shout.accept("Hello");

        // Use Case -> Lazy Initialization -> eg: generating IDs
        Supplier<Double> randNum = () -> Math.random(); // (The Lazy Factory)
        System.out.println(randNum.get());

        ///  QUICK CHEAT SHEET:
        /*
        *       INTERFACE        INPUT          OUTPUT           METHOD         COMMON-USE
        *       Predicate         T             boolean          test()         Filtering
        *       Consumer          T             void             accept()       Side Effects (e.g, print)
        *       Supplier          None          T                get()          Value generation
        * */

        // REAL-LIFE EXAMPLES:
        // Predicate  ->  "Is the burger spicy?" (true/false)
        // Consumer -> "Eat the burger" (action, no return)
        // Supplier -> "Give me a new burger" (no input, just gives burger)

        // This is literally how it works...
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Consumer<Integer> printIfEven = num -> {
            if (isEven.test(num)) System.out.println("10 is Even");
        };
        printIfEven.accept(10);

    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
