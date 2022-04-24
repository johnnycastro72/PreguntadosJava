package repository;

import domain.Category;
import domain.Prize;
import domain.Round;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoundRepository {
    private Connection conn = null;

    public Round getRound(Integer Id){
        PrizeRepository priRep = new PrizeRepository();
        CategoryRepository catRep = new CategoryRepository();
        Round round = null;
        String sql = "SELECT rou_prize_id, rou_category_id FROM round WHERE rou_id=?;";
        try{
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, Id);
            ResultSet result = statement.executeQuery();
            result.next();
            Prize prize = priRep.getPrize(result.getInt(1));
            Category category = catRep.getCategory(result.getInt(1));
            round = new Round(Id, prize, category);
        }
        catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode()+ "\nError :" + ex.getMessage());
        }
        return round;
    }

}
