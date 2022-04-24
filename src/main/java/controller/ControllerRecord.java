package controller;

import domain.Gamer;
import domain.Record;
import repository.RecordRepository;

import java.util.ArrayList;

public class ControllerRecord implements ICreate, IQuery{
    RecordRepository recordRepo = new RecordRepository();

    @Override
    public Record create(Object o) {
        recordRepo.insertRecord((Record) o);
        return null;
    }

    @Override
    public ArrayList<Record> query(Object o) {
        ArrayList<Record> records = recordRepo.getRecordsByGamer((Gamer) o);
        return records;
    }

    @Override
    public ArrayList<Record> query() {
        ArrayList<Record> records = recordRepo.getRecords();
        return records;
    }
}
