package domain;

import java.util.Objects;

public class Round {
    private final Integer Id;
    private final Prize prize;
    private final Category category;

    public Round(Integer id, Prize prize, Category category) {
        this.Id = Objects.requireNonNull(id);
        this.prize = Objects.requireNonNull(prize);
        this.category = Objects.requireNonNull(category);
    }

    public Integer Id() {
        return Id;
    }

    public Prize prize() {
        return prize;
    }

    public Category category() {
        return category;
    }
}
