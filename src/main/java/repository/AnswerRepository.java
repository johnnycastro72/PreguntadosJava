package repository;

import domain.Answer;
import domain.Question;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This class defines the answers repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class AnswerRepository {
    private Connection conn = null;

    /**
     * Get an array of answers by question from the database
     *
     * @param question a question instance
     * @return an array of answers
     */
    public ArrayList<Answer> getAnswersByQuestion(Question question) {
        ArrayList<Answer> answers = new ArrayList();
        String sql = "SELECT ans_id, ans_question_id, ans_text, ans_correct FROM answer WHERE answer.ans_question_id=?;";
        try {
            conn = ConnectionDB.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, question.Id());
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Answer answer = new Answer(result.getInt(1), question, result.getString(3), result.getBoolean(4));
                answers.add(answer);
            }
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return answers;
    }

    /**
     * Get an array of all answers from the database
     *
     * @return an array of answers
     */
    public ArrayList<Answer> getAnswers() {
        ArrayList<Answer> answers = new ArrayList();
        QuestionRepository questionRepository = new QuestionRepository();
        String sql = "SELECT ans_id, ans_question_id, ans_text, ans_correct FROM answer;";
        try {
            conn = ConnectionDB.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Question question = questionRepository.getQuestion(result.getInt(2));
                Answer answer = new Answer(result.getInt(1), question, result.getString(3), result.getBoolean(4));
                answers.add(answer);
            }
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return answers;
    }

}
