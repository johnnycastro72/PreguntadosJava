package controller;

import domain.Category;
import domain.Question;
import repository.QuestionRepository;

import java.util.ArrayList;

public class ControllerQuestion implements IQuery {
    QuestionRepository questionRepo = new QuestionRepository();

    @Override
    public ArrayList<Question> query(Object o) {
        ArrayList<Question> questions = questionRepo.getQuestionByCategory((Category) o);
        return questions;
    }

    @Override
    public ArrayList<Question> query() {
        ArrayList<Question> questions = questionRepo.getQuestions();
        return questions;
    }
}
