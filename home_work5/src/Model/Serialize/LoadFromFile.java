package Model.Serialize;

import Model.PhoneBook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadFromFile {
    static public PhoneBook loadData(String file) {
        PhoneBook phoneBook;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            phoneBook = (PhoneBook) objectInputStream.readObject();
            objectInputStream.close();
            return phoneBook;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Что-то пошло не так");
            System.out.println("Файл базы не найден");
            return null;
        }
    }
}
