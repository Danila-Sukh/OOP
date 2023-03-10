package home_work3.mainMenu;

import home_work3.Controller;

import java.util.Scanner;

public class LoadTree implements Option {
    @Override
    public void executeAction(Controller controller) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Файл для загрузки:");
        if (!controller.loadFromFile(scanner.nextLine()))
            System.out.println("Не загружено");
    }
}
