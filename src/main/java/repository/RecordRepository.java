package repository;

import domain.Gamer;
import domain.Record;
import utilities.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RecordRepository {
    private Connection conn = null;

    public ArrayList<Record> getRecords() {
        ArrayList<Record> records = new ArrayList();
        GamerRepository gamerRepo = new GamerRepository();
        String sql = "SELECT rec_id, rec_gamer_id, rec_date, rec_value FROM record;";
        try {
            conn = ConnectionDB.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Gamer gamer = gamerRepo.getGamer(result.getInt(2));
                Record record = new Record(result.getInt(1), gamer, result.getTimestamp(3), result.getFloat(4));
                records.add(record);
            }
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return records;
    }

    public ArrayList<Record> getRecordsByGamer(Gamer gamer) {
        ArrayList<Record> records = new ArrayList();
        String sql = "SELECT rec_id, rec_gamer_id, rec_date, rec_value FROM record WHERE rec_gamer_id=?;";
        try {
            conn = ConnectionDB.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, gamer.Id());
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Record record = new Record(result.getInt(1), gamer, result.getTimestamp(3), result.getFloat(4));
                records.add(record);
            }
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return records;
    }

    public void insertRecord(Record record) {
        String sql = "INSERT INTO record(rec_id, rec_gamer_id, rec_date, rec_value) VALUES (?, ?, ?, ?);";
        try {
            conn = ConnectionDB.getConnection();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, record.Id());
            statement.setInt(2, record.gamer().Id());
            statement.setTimestamp(3, record.date());
            statement.setFloat(4, record.value());

            Integer rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

}
