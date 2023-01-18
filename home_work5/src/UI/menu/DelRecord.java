package UI.menu;

import Controller.*;
import UI.InputAndOutput;

public class DelRecord implements Option{
    @Override
    public void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput) {
        phoneBookOperations.delRecord(inputAndOutput.delByFamilyName());
    }
}
