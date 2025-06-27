package Classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

        var list = new ArrayList<>();
        int[] numbers = {1, 2, 3};
        var stream = Arrays.stream(numbers);
        Stream.of(1, 2, 3, 4);
        Stream.generate(() -> Math.random());

        List<Movies> listMovies = List.of(
                new Movies("Peaky Blinder", 10),
                new Movies("Lucifer", 11),
                new Movies("After", 2)
        );

        // Imperative Programming (How it should be done)
        int count = 0;
        for (var movie : listMovies) {
            if (movie.getLikes() > 10)
                count++;
        }

        // Declarative Programming (What to be done) (like SQL)
        // STREAMS: To process a collection of data in a declarative way
        var count2 = listMovies.stream()
                        .filter(movie -> movie.getLikes() > 10)
                        .count();

        System.out.println(count);
        System.out.println("count2 " + count2);
    }

}
