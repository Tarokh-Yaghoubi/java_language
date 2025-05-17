package Collections;

import org.jetbrains.annotations.NotNull;

public class Customers implements Comparable<Customers> {
    private String name;
    private String email;

    public Customers(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(@NotNull Customers other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
