package repository;

import domain.Prize;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrizeRepository {
    private Connection conn = null;

    public Prize getPrize(Integer Id) {
        Prize prize = null;
        String sql = "SELECT pri_name, pri_value FROM prize WHERE pri_id=?;";
        try {
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, Id);
            ResultSet result = statement.executeQuery();
            result.next();
            prize = new Prize(Id, result.getString(1), result.getFloat(2));
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return prize;
    }

}
