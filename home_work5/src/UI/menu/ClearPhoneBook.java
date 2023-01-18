package UI.menu;

import Controller.*;
import UI.InputAndOutput;

public class ClearPhoneBook implements Option{
    @Override
    public void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput) {
        phoneBookOperations.clearBase();
        inputAndOutput.clearBaseMsg();
    }
}
