package home_work3.mainMenu;

import home_work3.Controller;

public class ShowFullTree implements Option {
    @Override
    public void executeAction(Controller controller) {
        controller.showTree();
    }
}
