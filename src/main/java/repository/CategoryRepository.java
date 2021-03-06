package repository;

import domain.Category;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class defines the categories repository
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class CategoryRepository {
    private Connection conn = null;

    /**
     * Get a category from the database
     *
     * @param Id  a category identifier
     * @return    a category instance
     */
    public Category getCategory(Integer Id) {
        Category category = null;
        String sql = "SELECT cat_level FROM category WHERE cat_id=?;";
        try {
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, Id);
            ResultSet result = statement.executeQuery();
            result.next();
            category = new Category(Id, result.getString(1));
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return category;
    }

}
