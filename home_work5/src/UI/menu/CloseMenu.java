package UI.menu;

import Controller.*;
import UI.InputAndOutput;

public class CloseMenu implements Option{
    @Override
    public void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput) {
        inputAndOutput.saveDataAndClose(phoneBookOperations.saveBase());
    }
}
