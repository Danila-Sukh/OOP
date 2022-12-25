package home_work2.mainMenu;

import home_work2.Controller;

public class CreateNewTree implements Option {
    @Override
    public void executeAction(Controller controller) {
        controller.createNewTree();
        System.out.println("Создано новое дерево!");
    }
}
