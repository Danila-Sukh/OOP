package Model;

import Model.Serialize.LoadFromFile;
import Model.Serialize.SaveToFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements Serializable {
    private final List<Record> recordList;
    private final String dataFile;


    public PhoneBook(String dataFile) {
        this.dataFile = dataFile;
        PhoneBook data = LoadFromFile.loadData(dataFile);
        if (data != null)
            this.recordList = data.getRecordList();
        else
            recordList = new ArrayList<>();
    }

    public List<Record> getRecordList() {
        return recordList;
    }

    public String getDataFile() {
        return dataFile;
    }

    public void close(){
        SaveToFile.saveData(dataFile, this);
    }
}
