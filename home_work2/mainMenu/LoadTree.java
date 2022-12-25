package home_work2.mainMenu;

import home_work2.Controller;

import java.util.Scanner;

public class LoadTree implements Option {
    @Override
    public void executeAction(Controller controller) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Файл для загрузки:");
        controller.loadFromFile(scanner.nextLine());
    }
}
