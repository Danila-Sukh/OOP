package home_work3.mainMenu;

import home_work3.Controller;

import java.util.Scanner;

public class CloseAndSave implements Option {
    @Override
    public void executeAction(Controller controller) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла для сохранения:");
        controller.saveToFile(scanner.nextLine());
    }
}
