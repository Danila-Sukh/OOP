package home_work1.Task1;
public class Main {
        public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person ilya = new Person("Илья");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.appendPerentChild(irina, vasya); 
        gt.appendPerentChild(irina, masha);
        gt.appendPerentChild(vasya, jane);
        gt.appendPerentChild(vasya, ivan);
        gt.appendVifeHusbent(irina, ilya); 
        gt.appendPerentChild(ilya, vasya); 
        gt.appendPerentChild(ilya, masha); 

        System.out.println("Дети Ирины");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));

        System.out.println("Дети Ильи");
        System.out.println(new Reserch(gt).spend(ilya,
                Relationship.parent));

        System.out.println("Муж Ирины");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.wife));
    }
}