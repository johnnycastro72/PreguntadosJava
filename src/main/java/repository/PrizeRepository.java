package repository;

import domain.Prize;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class defines the prizes repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class PrizeRepository {
    private Connection conn = null;

    /**
     * Get an instance of a prize from the database
     *
     * @param Id a prize identifier
     * @return a prize instance
     */
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
