package domain;

import java.util.Objects;

/**
 * This class defines the prizes model
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Prize {
    private final Integer Id;
    private final String name;
    private final Float value;

    /**
     * Answer constructor
     *
     * @param id        unique identifier
     * @param name      the prize name
     * @param value     indicates the prize value
     */
    public Prize(Integer id, String name, Float value) {
        this.Id = Objects.requireNonNull(id);
        this.name = name;
        this.value = value;
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
     * value attribute accessor method
     *
     * @return <Float> value
     */
    public Float value() {
        return value;
    }

    /**
     * Return a string with the value
     *
     * @return <String> value plus 'pesos más.'
     */
    @Override
    public String toString() {
        return value + " pesos más.";
    }
}
