package UI.menu;

import Controller.*;
import UI.InputAndOutput;

public class AddRecord implements Option{
    @Override
    public void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput) {
        phoneBookOperations.addRecord(inputAndOutput.inputRecord());
    }
}
