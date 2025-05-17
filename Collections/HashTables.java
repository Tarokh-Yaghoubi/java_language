package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashTables {
    public static void show() {
        var c1 = new Customers("a", "e1");
        var c2 = new Customers("b", "e2");

        Map<String, Customers> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var  customer = map.get("e1");
        map.replace("e1", new Customers("a++", "e1"));
        System.out.println(map);
    }
}
