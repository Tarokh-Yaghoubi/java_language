package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        List<Customers> customers = new ArrayList<>();
        customers.add(new Customers("b", "tarokhgit5@gmail.com"));
        customers.add(new Customers("a", "tarokhgit3@gmail.com"));
        customers.add(new Customers("g", "tarokhgit2@gmail.com"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
        System.out.println("---------------");

        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.clear();
        Collections.addAll(collection, "d", "e", "f");
        var arr = collection.toArray(new String[0]);

        System.out.println(collection);

        SetDemo.show();
        HashTables.show();
    }
}

class CollectionsDemoMain {
    public static void main(String[] args) {
        CollectionsDemo.show();
    }
}
