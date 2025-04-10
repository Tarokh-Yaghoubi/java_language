package generics;

// The 'T' represents the type of objects we wanna store in the class
// just like our methods can have parameters, our class can have parameters as well.
// Also we can use 'E', to specify that this class takes many elements.

public class GenericList<T> {
    // here we have a compilation error, because the compiler does not know the type of T
    // at this stage.
    // so we can use Object class and cast it to an array of T.

    private  T[] items = (T[]) new Object[10];
    private int count = 0;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}


class GenericListDemo {
    public static void main(String[] args) {

        // This way, we have compile-time type-safety.

        var genericList = new GenericList<Integer>();
        var genericStr = new GenericList<String>();

        genericList.add(3);
        genericList.add(4);
        genericList.add(5);
        genericList.add(6);

        genericStr.add("First");
        genericStr.add("Second");
        String second = genericStr.get(1);
        System.out.println("Second param -> " + second);
    }
}
