package domain;

import java.util.Objects;

/**
 * This class defines the rounds model
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Round {
    private final Integer Id;
    private final Prize prize;
    private final Category category;

    /**
     * Round constructor
     *
     * @param id        unique identifier
     * @param prize     an instance of a prize
     * @param category  an instance of a category
     */
    public Round(Integer id, Prize prize, Category category) {
        this.Id = Objects.requireNonNull(id);
        this.prize = Objects.requireNonNull(prize);
        this.category = Objects.requireNonNull(category);
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
     * prize attribute accessor method
     *
     * @return <Prize> object
     */
    public Prize prize() {
        return prize;
    }

    /**
     * category attribute accessor method
     *
     * @return <Category> object
     */
    public Category category() {
        return category;
    }
}
