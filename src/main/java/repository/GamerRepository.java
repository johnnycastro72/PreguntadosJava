package repository;

import domain.Gamer;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class defines the gamers repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class GamerRepository {
    private Connection conn = null;

    /**
     * Get a gamer instance from the database
     *
     * @param Id  a gamer identifier
     * @return a gamer instance
     */
    public Gamer getGamer(Integer Id) {
        Gamer gamer = null;
        String sql = "SELECT gam_name FROM gamer WHERE gam_id=?;";
        try {
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, Id);
            ResultSet result = statement.executeQuery();
            result.next();
            gamer = new Gamer(Id, result.getString(1));
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return gamer;
    }

    /**
     * Get the last created gamer instance from the database
     *
     * @return a gamer instance
     */
    public Gamer getLastGamer() {
        Gamer gamer = null;
        String sql = "SELECT gam_id, gam_name FROM gamer ORDER BY gam_id DESC LIMIT 1;";
        try {
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            result.next();
            gamer = new Gamer(result.getInt(1), result.getString(2));
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return gamer;
    }

    /**
     * Insert a gamer into the database
     *
     * @param gamer  a gamer instance
     */
    public void insertGamer(Gamer gamer) {
        String sql = "INSERT INTO gamer(gam_name) VALUES (?);";
        try {
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, gamer.name());

            int rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

}
