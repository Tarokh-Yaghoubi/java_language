package generics;

import org.jetbrains.annotations.NotNull;

public class Utils {

    public static <T extends Comparable<T>> T max(@NotNull T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static <K, V>void print(K key, V value) {
        System.out.println(key + " " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    // ? is a wildcard - it can extend a class, So it lets you pass a User class obj or its derivatives obj
//    public static void printUsers(GenericList<? extends User> user) {
//
//    }
}
