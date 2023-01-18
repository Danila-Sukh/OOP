package Controller;

import Model.PhoneBook;
import UI.*;

public class Controller {
    PhoneBook phoneBook;
    PhoneBookOperations phoneBookOperations;
    InputAndOutput inputAndOutput;

    public Controller(String phoneBookFile, InputAndOutput inputAndOutput) {
        this.phoneBook = new PhoneBook(phoneBookFile);
        phoneBookOperations = new PhoneBookOperations(this.phoneBook);
        this.inputAndOutput = inputAndOutput;
    }
    public void run(){
        inputAndOutput.startMenu(phoneBookOperations);
    }
}
