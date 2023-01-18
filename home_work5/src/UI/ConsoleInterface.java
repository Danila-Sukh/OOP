package UI;

import Controller.PhoneBookOperations;
import ImportAndExport.BaseExport;
import ImportAndExport.BaseImport;
import ImportAndExport.ExportJSON;
import ImportAndExport.ExportXML;
import Model.Record;
import UI.menu.*;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsoleInterface implements InputAndOutput{
    @Override
    public Record inputRecord() {
        String name = consoleInput("Input name:");
        String familyName = consoleInput("Input family Name:");
        String phoneNumber = consoleInput("Input phone number (format +7(812)65384148):");
        String type = consoleInput("Input type of number:");
        return new Record(name, familyName,phoneNumber,type);
    }


    @Override
    public void showRecord(Record record) {
        System.out.println(record);
    }

    @Override
    public void showRecords(List<Record> recordList) {
        for( Record record: recordList)
            System.out.println(record);
    }


    @Override
    public void saveDataAndClose(boolean saved) {
        if (saved)
            System.out.println("Данные успешно сохранены");
        else
            System.out.println("Данные не сохранены, что-то пошло не так!");
    }

    private String consoleInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        String result = null;
        if(scanner.hasNextLine())
            result = scanner.nextLine();
        scanner.close();
        return result;
    }

    @Override
    public String findByFamilyName() {
        return consoleInput("Введите фамилию для поиска номера телефона");
    }

    @Override
    public String delByFamilyName() {
        return consoleInput("Введите фамилию для удаления номера");
    }

    @Override
    public void clearBaseMsg() {
        System.out.println("Все записи удалены!");
    }

    @Override
    public BaseImport importRecords() {
        return null;
    }

    @Override
    public BaseExport exportRecords() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while(result != 3){
            System.out.println("1. Экспортировать в JSON");
            System.out.println("2. Экспортировать в XML");
            System.out.println("3. Выйти");
            if (scanner.hasNextInt()){
                result = scanner.nextInt();
                if (result == 1) {
                    scanner.close();
                    return new ExportJSON();
                }
                else if (result == 2){
                    scanner.close();
                    return new ExportXML();
                }
            }else
                scanner.next();
        }
        scanner.close();
        return null;
    }

    @Override
    public String importDestination() {
        return consoleInput("Введите имя файла для импорта:");
    }

    @Override
    public String exportDestination() {
        return consoleInput("Введите имя файла для экспорта:");
    }

    @Override
    public void startMenu(PhoneBookOperations phoneBookOperations) {
        Map<Integer, Option> mainMenu = new HashMap<>();
        mainMenu.put(1, new AddRecord());
        mainMenu.put(2, new Find());
        mainMenu.put(3, new AllRecords());
        mainMenu.put(4, new DelRecord());
        mainMenu.put(5, new Export());
        mainMenu.put(6, new Import());
        mainMenu.put(7, new ClearPhoneBook());
        mainMenu.put(8, new CloseMenu());
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while(result != 6){
            System.out.println("1. Добавить запись");
            System.out.println("2. Поиск по фамилии");
            System.out.println("3. Показать все записи");
            System.out.println("4. Удалить запись");
            System.out.println("5. Экспортировать");
            System.out.println("6. Импортировать");
            System.out.println("7. Очистить записную книгу");
            System.out.println("8. Выйти");
            if (scanner.hasNextInt()){
                if (mainMenu.containsKey(result = scanner.nextInt())) {
                    mainMenu.get(result).executeAction(phoneBookOperations, this);
                }
            }else scanner.next();
        }
        scanner.close();
    }
}
