package controller;

import domain.Gamer;
import domain.Record;
import repository.RecordRepository;

import java.util.ArrayList;

/**
 * This class create a record into the repository and get a list of records
 *
 * @version 1.0.0 24/04/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @author Lorena Castro lcastro98@gmail.com
 * @author Adryan Ynfante adryanynfante@gmail.com
 * @since 1.0.0
 */
public class ControllerRecord implements ICreate, IQuery {
    RecordRepository recordRepo = new RecordRepository();

    /**
     * Insert a record into the repository
     *
     * @param o an instance of the record object
     * @return null
     */
    @Override
    public Record create(Object o) {
        recordRepo.insertRecord((Record) o);
        return null;
    }

    /**
     * Get a list of records by gamer.
     *
     * @param o <Gamer> owner of the records
     * @return array of records
     */
    @Override
    public ArrayList<Record> query(Object o) {
        ArrayList<Record> records = recordRepo.getRecordsByGamer((Gamer) o);
        return records;
    }

    /**
     * Get a list of all records.
     *
     * @return array of records
     */
    @Override
    public ArrayList<Record> query() {
        ArrayList<Record> records = recordRepo.getRecords();
        return records;
    }
}
