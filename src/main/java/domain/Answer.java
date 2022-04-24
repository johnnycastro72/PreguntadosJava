package domain;

import java.util.Objects;

public class Answer {
    private final Integer Id;
    private final Question question;
    private final String text;
    private final Boolean correct;

    public Answer(Integer id, Question question, String text, Boolean correct) {
        this.Id = Objects.requireNonNull(id);
        this.question = Objects.requireNonNull(question);
        this.text = Objects.requireNonNull(text);
        this.correct = Objects.requireNonNull(correct);
    }

    public Integer Id() {
        return this.Id;
    }

    public Boolean correct() {
        return this.correct;
    }

    public Question question() {
        return question;
    }

    public String text() {
        return text;
    }
}
