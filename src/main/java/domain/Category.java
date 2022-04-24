package domain;

import java.util.Objects;

public class Category {
    private final Integer Id;
    private final String level;

    public Category(Integer id, String level) {
        this.Id = Objects.requireNonNull(id);
        this.level = Objects.requireNonNull(level);
    }

    public Integer Id() {
        return Id;
    }

    public String level() {
        return level;
    }
}
