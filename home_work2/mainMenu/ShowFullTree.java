package home_work2.mainMenu;

import home_work2.Controller;

public class ShowFullTree implements Option{
    @Override
    public void executeAction(Controller controller) {
        controller.showTree();
    }
}
