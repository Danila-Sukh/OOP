package home_work1.Task2;
public class Main {
    public static void main(String[] args) {

        Person vasia = new Person("Vasia", "No");
        Locker locker = new Locker("Close");

        SearchKey ishem = new SearchKey(vasia, locker);
        OpenLocker open = new OpenLocker(vasia, locker);

        System.out.println("Начальное состояние");
        System.out.println(vasia);
        System.out.println(locker);

        if ((vasia.getKey() == "Yes" || vasia.getKey() == "No") && locker.getStatus() == "Open") {
            System.out.println("Шкаф открыт");
        } else if (vasia.getKey() == "Yes" && locker.getStatus() == "Close") {
            open.openLocker();
            System.out.println(vasia);
            System.out.println(locker);
        } else if (vasia.getKey() == "No" && locker.getStatus() == "Close") {
            ishem.poisk();
            System.out.println(vasia);
            System.out.println(locker);
            open.openLocker();
            System.out.println(locker);
        }
    }
}
