package generics;

import org.jetbrains.annotations.NotNull;

// The comparable Interface is for comparing two objects.
// We need to override the compareTo method

public class User implements Comparable<User>{

    private int points;

    public User (int points) {
        this.points = points;
    }

    @Override
    public int compareTo(@NotNull User user) {
        return points - user.points;
    }

    @Override
    public String toString() {
        return "Points = " + points;
    }
}
