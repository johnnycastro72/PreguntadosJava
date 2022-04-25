package utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * This class is the one that establishes the connection to the database
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class ConnectionDB {

    /**
     * Establish the connection with the database
     *
     * @return conn a connection instance
     */
    public static Connection getConnection() {
        JSONParser parser = new JSONParser();
        Connection conn = null;
        // connect
        try {
            String credentials_path = System.getProperty("user.dir") + "/src/main/java/utilities/db_credentials.json";
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(credentials_path));

            String host = (String) jsonObject.get("db_ip");
            String port = (String) jsonObject.get("dp_port");
            String username = (String) jsonObject.get("db_user");
            String password = (String) jsonObject.get("db_password");
            String schema_name = "preguntados";
            String dbURL = "jdbc:mysql://" + host + ":" + port + "/" + schema_name;

            conn = DriverManager.getConnection(dbURL, username, password);

        } catch (SQLException | FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }

        return conn;
    }

}
