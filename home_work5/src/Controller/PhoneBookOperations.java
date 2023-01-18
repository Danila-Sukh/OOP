package Controller;

import ImportAndExport.BaseExport;
import ImportAndExport.BaseImport;
import Model.PhoneBook;
import Model.Record;
import Model.Serialize.SaveToFile;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneBookOperations {
    PhoneBook phoneBook;
    public PhoneBookOperations(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }
    public void addRecord(Record record){
        phoneBook.getRecordList().add(record);
    }
    public List<Record> findRecordsByFamilyName(String familyName){
        return phoneBook.getRecordList().stream().filter(i -> i.getFamilyName().equals(familyName))
                .collect(Collectors.toList());
    }
    public List<Record> findAll(){
        return phoneBook.getRecordList();
    }
    public void delRecord(String familyName){
        for(Record record: phoneBook.getRecordList()){
            if(record.getFamilyName().equals(familyName)) {
                phoneBook.getRecordList().remove(record);
                break;
            }
        }
    }
    public void clearBase(){
        phoneBook.getRecordList().clear();
    }
    public boolean saveBase(){
        return SaveToFile.saveData(phoneBook.getDataFile(), phoneBook);
    }
    public void exportData(BaseExport baseExport, String fileName){
        baseExport.makeExport(fileName);
    }
    public void importData(BaseImport baseImport, String fileName){
        baseImport.makeImport(fileName);
    }
}
