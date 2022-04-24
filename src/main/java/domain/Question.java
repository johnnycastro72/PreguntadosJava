package domain;

import java.util.ArrayList;
import java.util.Objects;

public class Question {
    private final Integer Id;
    private final Category category;
    private final String text;

    public Question(Integer id, Category category, String text) {
        this.Id = Objects.requireNonNull(id);
        this.category = Objects.requireNonNull(category);
        this.text = Objects.requireNonNull(text);

    }

    public Integer Id() {
        return Id;
    }

    public Category category() {
        return category;
    }

    public String text() {
        return text;
    }
}
