package controller;

import domain.Category;
import domain.Question;
import repository.QuestionRepository;

import java.util.ArrayList;

/**
 * This class get a lists of questions from repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class ControllerQuestion implements IQuery {
    QuestionRepository questionRepo = new QuestionRepository();

    /**
     * Get a list of questions by categories
     *
     * @param o <Category> owner of the questions
     * @return array of questions
     */
    @Override
    public ArrayList<Question> query(Object o) {
        ArrayList<Question> questions = questionRepo.getQuestionByCategory((Category) o);
        return questions;
    }

    /**
     * Get a list of all questions
     *
     * @return array of questions
     */
    @Override
    public ArrayList<Question> query() {
        ArrayList<Question> questions = questionRepo.getQuestions();
        return questions;
    }
}
