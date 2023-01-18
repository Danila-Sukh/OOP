package UI.menu;

import Controller.*;
import UI.InputAndOutput;

public class AllRecords implements Option{
    @Override
    public void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput) {
        inputAndOutput.showRecords(phoneBookOperations.findAll());
    }
}
