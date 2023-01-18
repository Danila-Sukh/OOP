package UI;

import Controller.PhoneBookOperations;
import ImportAndExport.BaseExport;
import ImportAndExport.BaseImport;
import Model.Record;

import java.util.List;

public interface InputAndOutput {
    Record inputRecord();
    String findByFamilyName();
    String delByFamilyName();
    BaseImport importRecords();
    void showRecord(Record record);
    void showRecords(List<Record> recordList);
    BaseExport exportRecords();
    void saveDataAndClose(boolean saved);
    void startMenu(PhoneBookOperations phoneBookOperations);
    void clearBaseMsg();
    String importDestination();
    String exportDestination();
}
