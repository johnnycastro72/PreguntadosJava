package domain;

import java.util.Objects;

public class Score {
    private String gamer;
    private Float  score;

    public Score(String gamer, Float score) {
        this.gamer = Objects.requireNonNull(gamer);
        this.score = Objects.requireNonNull(score);
    }

    public String gamer() {
        return gamer;
    }

    public Float score() {
        return score;
    }
}
