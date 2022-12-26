package homewohome_work3rk3.mainMenu;

import home_work3.Controller;

public class CreateNewTree implements Option {
    @Override
    public void executeAction(Controller controller) {
        controller.createNewTree();
        System.out.println("Создано новое дерево!");
    }
}
