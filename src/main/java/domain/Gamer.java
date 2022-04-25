package domain;

import java.util.Objects;

/**
 * This class defines the gamers model
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Gamer {
    private final Integer Id;
    private String name;

    /**
     * Gamer constructor
     *
     * @param Id        unique identifier
     * @param name      the gamer name
     */
    public Gamer(Integer Id, String name) {
        this.Id = Objects.requireNonNull(Id);
        this.name = Objects.requireNonNull(name);
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
     * name attribute accessor method
     *
     * @return <String> name
     */
    public String name() {
        return name;
    }

    /**
     * return a string with the gamer name
     *
     * @return <String> name
     */
    @Override
    public String toString() {
        return name;
    }
}
