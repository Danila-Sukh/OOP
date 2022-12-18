package home_work1.mainMenu;
import home_work1.MovieDB;
public class CloseAndSave implements Option{
    @Override
    public void executeAction(MovieDB movieDB) {
        movieDB.saveData();
    }
}
