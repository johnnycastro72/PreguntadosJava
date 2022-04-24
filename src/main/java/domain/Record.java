package domain;

import java.sql.Timestamp;
import java.util.Objects;

public class Record {
    private final Integer Id;
    private Gamer gamer;
    private Timestamp date;
    private Float value;

    public Record(Integer id, Gamer gamer, Timestamp date, Float value) {
        this.Id = Objects.requireNonNull(id);
        this.gamer = Objects.requireNonNull(gamer);
        this.date = Objects.requireNonNull(date);
        this.value = Objects.requireNonNull(value);
    }

    public Integer Id() {
        return Id;
    }

    public Gamer gamer() {
        return gamer;
    }

    public Timestamp date() {
        return date;
    }

    public Float value() {
        return value;
    }

    @Override
    public String toString() {
        return "* " + Id + " * " + gamer.toString() + "*" + value + " * ";
    }
}
