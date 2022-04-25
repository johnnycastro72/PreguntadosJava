package domain;

import java.util.Objects;

/**
 * This class defines the category model
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Category {
    private final Integer Id;
    private final String level;

    /**
     * Category constructor
     *
     * @param id        unique identifier
     * @param level     category level
     */
    public Category(Integer id, String level) {
        this.Id = Objects.requireNonNull(id);
        this.level = Objects.requireNonNull(level);
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
     * level attribute accessor method
     *
     * @return <String> level
     */
    public String level() {
        return level;
    }
}
