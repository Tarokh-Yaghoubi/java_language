package generics;

public class List {
    private Object[] items  = new Object[10];
    private int count  = 0;

    public void add(Object item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }

}

class GenericsDemo {
    public static void main(String[] args) {
        var list  = new List();
        list.add(34);
        list.add("34");
        list.add(true);

        int first = (int)list.get(0);
        String second = (String)list.get(1);

        System.out.println(first + " - " + second);
    }
}
