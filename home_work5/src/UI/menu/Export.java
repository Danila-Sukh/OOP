package UI.menu;

import Controller.PhoneBookOperations;
import ImportAndExport.BaseExport;
import UI.InputAndOutput;

public class Export implements Option{
    @Override
    public void executeAction(PhoneBookOperations phoneBookOperations, InputAndOutput inputAndOutput) {
        BaseExport exportAction = inputAndOutput.exportRecords();
        String exportFile = inputAndOutput.exportDestination();
        exportAction.makeExport(exportFile);
    }
}
