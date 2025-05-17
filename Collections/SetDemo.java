package Collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "a", "B", "c");
        Set<String> sortArr = new HashSet<>(collection);
        System.out.println(sortArr);

        Set<String> set1 =
                new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set2 =
                new HashSet<>(Arrays.asList("b", "c", "d"));

        // there are four operations we need to understand when it comes to Sets.

        // UNIONS -> Combine two sets
        set1.addAll(set2); // it unites both sets without duplication.

        // Intersection -> retailAll.
        // It gives the items that are common in both sets.

        set1.retainAll(set2);

        set1.removeAll(set2); // here we remove all we have in set2 and we will keep other things that
        // we only have in set1

        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("sky");

        // SET guarantees uniqueness, it does not guarantee the sort of the items.
        System.out.println(set);
    }
}
