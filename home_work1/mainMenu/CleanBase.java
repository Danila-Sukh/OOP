package home_work1.mainMenu;
import home_work1.MovieDB;
public class CleanBase implements Option{
    @Override
    public void executeAction(MovieDB movieDB) {
        movieDB.cleanAll();
        System.out.println("База очищена!");
    }
}
