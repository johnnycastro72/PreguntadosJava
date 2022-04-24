package domain;

import java.util.Objects;

public class Gamer {
    private final Integer Id;
    private String name;

    public Gamer(Integer Id, String name) {
        this.Id = Objects.requireNonNull(Id);
        this.name = Objects.requireNonNull(name);
    }

    public Integer Id() {
        return Id;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
