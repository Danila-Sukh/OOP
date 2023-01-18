package Model;

import java.io.Serializable;

public class Record implements Serializable {
    private String name;
    private String familyName;
    private TelephoneNumber telephoneNumber;
    private String type;

    public Record(String name, String familyName, String phoneNumber, String type) {
        this.name = name;
        this.familyName = familyName;
        this.telephoneNumber = new TelephoneNumber(phoneNumber);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", type='" + type + '\'' +
                '}';
    }
}
