import Controller.Controller;
import UI.ConsoleInterface;

public class MainApp {
    public static void main(String[] args) {
        Controller controller = new Controller("phoneBookData.data", new ConsoleInterface());
        controller.run();
    }
}
