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


public class ConnectionDB {

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
