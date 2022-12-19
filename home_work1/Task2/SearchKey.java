package home_work1.Task2;
public class SearchKey {

    Person p;
    Locker l;

    public SearchKey(Person p, Locker l) {
        this.p = p;
        this.l = l;
    }

    public Person poisk() {

        if (p.getKey() == "No" && l.getStatus() == "Close") {
            System.out.println("Чтобы открыть нужен ключ");
            System.out.println("Ключ лежит на тумбочке.");
            System.out.println("Ключ найден!");
            p.setKey("Yes");
        }
        return p;
    }
}