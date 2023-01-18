package Model.Serialize;

import Model.PhoneBook;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveToFile {
    static public boolean saveData(String file, PhoneBook phoneBook){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(file)));
            objectOutputStream.writeObject(phoneBook);
            objectOutputStream.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
