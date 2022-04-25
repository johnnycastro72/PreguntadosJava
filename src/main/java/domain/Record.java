package domain;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * This class defines the records model
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Record {
    private final Integer Id;
    private Gamer gamer;
    private Timestamp date;
    private Float value;

    /**
     * Record constructor
     *
     * @param id      unique identifier
     * @param gamer   an instance of a gamer
     * @param date    the timestamp of the round
     * @param value   the total prize value won
     */
    public Record(Integer id, Gamer gamer, Timestamp date, Float value) {
        this.Id = Objects.requireNonNull(id);
        this.gamer = Objects.requireNonNull(gamer);
        this.date = Objects.requireNonNull(date);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Id attribute accessor method
     *
     * @return <Integer> Id
     */
    public Integer Id() {
        return Id;
    }

    /**
     * gamer attribute accessor method
     *
     * @return <Gamer> gamer
     */
    public Gamer gamer() {
        return gamer;
    }

    /**
     * date attribute accessor method
     *
     * @return <Timestamp> date
     */
    public Timestamp date() {
        return date;
    }

    /**
     * value attribute accessor method
     *
     * @return <Float> value
     */
    public Float value() {
        return value;
    }

    /**
     * Return a formated attributes string
     *
     * @return <String> Id
     */
    @Override
    public String toString() {
        return "║ " + Id + " ║ " + gamer.toString() + " ║ " + value + " ║ ";
    }
}
