package domain;

import java.util.Objects;

/**
 * This class defines the answers model
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class Answer {
    private final Integer Id;
    private final Question question;
    private final String text;
    private final Boolean correct;

    /**
     * Answer constructor
     *
     * @param id        unique identifier
     * @param question  an instance of a question
     * @param text      the wording of the answer
     * @param correct   indicates if this is the correct answer
     */
    public Answer(Integer id, Question question, String text, Boolean correct) {
        this.Id = Objects.requireNonNull(id);
        this.question = Objects.requireNonNull(question);
        this.text = Objects.requireNonNull(text);
        this.correct = Objects.requireNonNull(correct);
    }

    /**
     * Id attribute accessor method
     *
     * @return <Integer> Id
     */
    public Integer Id() {
        return this.Id;
    }

    /**
     * correct attribute accessor method
     *
     * @return <Boolean> correct
     */
    public Boolean correct() {
        return this.correct;
    }

    /**
     * question attribute accessor method
     *
     * @return <Question> object
     */
    public Question question() {
        return question;
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
