package home_work1.mainMenu;
import home_work1.MovieDB;
public class ShowAllMovies implements Option{
    @Override
    public void executeAction(MovieDB movieDB) {
        System.out.println(MovieDB.showResult(movieDB.getAll()));
    }
}
