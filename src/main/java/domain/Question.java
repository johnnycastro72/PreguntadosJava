package domain;

import java.util.Objects;

/**
 * This class defines the questions model
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Question {
    private final Integer Id;
    private final Category category;
    private final String text;

    /**
     * Question constructor
     *
     * @param id        unique identifier
     * @param category  an instance of a category
     * @param text      the wording of the question
     */
    public Question(Integer id, Category category, String text) {
        this.Id = Objects.requireNonNull(id);
        this.category = Objects.requireNonNull(category);
        this.text = Objects.requireNonNull(text);

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
     * category attribute accessor method
     *
     * @return <Category> category
     */
    public Category category() {
        return category;
    }

    /**
     * text attribute accessor method
     *
     * @return <String> text
     */
    public String text() {
        return text;
    }
}
