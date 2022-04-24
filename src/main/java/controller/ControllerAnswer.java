package controller;

import domain.Answer;
import domain.Question;
import repository.AnswerRepository;

import java.util.ArrayList;

public class ControllerAnswer implements IQuery{
    AnswerRepository answerRepository = new AnswerRepository();

    @Override
    public ArrayList<Answer> query(Object o) {
        ArrayList<Answer> answers = answerRepository.getAnswersByQuestion((Question) o);
        return answers;
    }

    @Override
    public ArrayList<Answer> query() {
        ArrayList<Answer> answers = answerRepository.getAnswers();
        return answers;
    }
}
