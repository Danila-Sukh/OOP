package home_work1.Task2;
public class OpenLocker {
    Person p;
    Locker l;

    public OpenLocker(Person p, Locker l) {
        this.p = p;
        this.l = l;
    }

    public Locker openLocker() {
        if (p.getKey() == "Yes" && l.getStatus() == "Close") {
            l.setStatus("Open");
            System.out.println("Шкаф открыт!");
        }
        return l;
    }
}
