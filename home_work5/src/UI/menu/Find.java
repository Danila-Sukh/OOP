package UI.menu;

import Controller.*;
import UI.InputAndOutput;

public class Find implements Option{
    @Override
    public void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput) {
        System.out.println(phoneBookOperations.findRecordsByFamilyName(inputAndOutput.findByFamilyName()));
    }
}
