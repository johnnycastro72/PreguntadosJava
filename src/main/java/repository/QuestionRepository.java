package repository;

import domain.Category;
import domain.Question;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestionRepository {
    private Connection conn = null;

    public ArrayList<Question> getQuestionByCategory(Category category){
        ArrayList<Question> questions = new ArrayList();
        String sql          = "SELECT que_id, que_category_id, que_text FROM question WHERE question.que_category_id=?;";
        try {
            conn = ConnectionDB.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, category.Id());
            ResultSet result    = statement.executeQuery();

            while (result.next()) {
                Question question = new Question(result.getInt(1), category, result.getString(3));
                questions.add( question );
            }
        }
        catch(SQLException ex){
            System.out.println("Código : " + ex.getErrorCode()+ "\nError :" + ex.getMessage());
        }
        return questions;
    }

    public Question getQuestion(Integer Id){
        Question question = null;
        CategoryRepository catRep = new CategoryRepository();
        String sql = "SELECT que_category_id, que_text FROM question WHERE que_id=?;";
        try{
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, Id);
            ResultSet result = statement.executeQuery();
            result.next();
            Category category = catRep.getCategory(result.getInt(1));
            question = new Question(Id, category, result.getString(2));
        }
        catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode()+ "\nError :" + ex.getMessage());
        }
        return question;
    }

    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList();
        CategoryRepository catRep = new CategoryRepository();
        String sql = "SELECT que_id, que_category_id, que_text FROM question;";
        try{
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Category category = catRep.getCategory(result.getInt(2));
                Question question = new Question(result.getInt(1), category, result.getString(3));
                questions.add( question );
            }
        }
        catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode()+ "\nError :" + ex.getMessage());
        }
        return questions;
    }
}
