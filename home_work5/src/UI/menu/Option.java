package UI.menu;

import Controller.*;
import UI.InputAndOutput;

public interface Option {
    void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput);
}
