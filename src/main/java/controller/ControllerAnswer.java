package controller;

import domain.Answer;
import domain.Question;
import repository.AnswerRepository;

import java.util.ArrayList;

/**
 * This class get a lists of answers from the repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class ControllerAnswer implements IQuery {
    AnswerRepository answerRepository = new AnswerRepository();

    /**
     * Get a list of answers by question.
     *
     * @param o <Question> owner of the answers
     * @return array of answers
     */
    @Override
    public ArrayList<Answer> query(Object o) {
        ArrayList<Answer> answers = answerRepository.getAnswersByQuestion((Question) o);
        return answers;
    }

    /**
     * Get a list of all answers.
     *
     * @return array of answers
     */
    @Override
    public ArrayList<Answer> query() {
        ArrayList<Answer> answers = answerRepository.getAnswers();
        return answers;
    }
}
