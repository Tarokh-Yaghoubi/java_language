package generics;

// The 'T' represents the type of objects we wanna store in the class
// just like our methods can have parameters, our class can have parameters as well.
// Also we can use 'E', to specify that this class takes many elements.

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
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

    @Override
    public @NotNull Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {

        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}


class GenericListDemo {
    public static void main(String[] args) {

        var max = Utils.max(new User(2), new User(3));
        System.out.println(max);
        Utils.printUser(new Instructor(23));
        // This way, we have compile-time type-safety.

        var genericList = new GenericList<Integer>();
//      var genericStr = new GenericList<String>();

        genericList.add(3);
        genericList.add(4);
        genericList.add(5);
        genericList.add(6);

        // we have restricted our generic class to only accept Number class children
//        genericStr.add("First");
//        genericStr.add("Second");
//        String second = genericStr.get(1);
//        System.out.println("Second param -> " + second);

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(23);
    }
}
