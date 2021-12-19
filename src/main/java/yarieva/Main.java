package yarieva;

public class Main {
    public static void main(String[] args) {
        //Создаем родительский объект насекомое
        Bug bug = new Bug("Насекомое", 5, "Зеленый");
        String bugName = bug.getName();
        int bugSize = bug.getSize();
        String bugColor = bug.getColor();
        System.out.println("Создаем родительский объект насекомое");
        Bug.printClassname();
        System.out.println("наименование- " + bugName + " Размер " + bugSize + " Окрас " + bugColor);
        System.out.println("Умеет делать");
        Bug.sitDown();
        System.out.println();

        //Создаем дочерний объект бабочка
        Butterfly butterfly = new Butterfly("Бабочка", 10, "Оранжевый");

        String butterflyName = butterfly.getName();
        int butterflySize = butterfly.getSize();
        String butterflyColor = butterfly.getColor();
        System.out.println("Создаем дочерний объект бабочка");
        Butterfly.printClassname();
        System.out.println("наименование- " + butterflyName + " Размер " + butterflySize + " Окрас " + butterflyColor);
        System.out.println("Умеет делать");
        Butterfly.sitDown();
        Butterfly.fly();
        Butterfly.collectPollen();
        System.out.println();

        //Создаем дочерний объект кузнечик
        Grig grig = new Grig("Кузнечик", 4, "Салатовый");
        String grigName = grig.getName();
        int grigSize = grig.getSize();
        String grigColor = grig.getColor();
        System.out.println("Создаем дочерний объект кузнечик");
        Grig.printClassname();
        System.out.println("наименование- " + grigName + " Размер " + grigSize + " Окрас " + grigColor);
        System.out.println("Умеет делать");
        Grig.sitDown();
        Grig.jump();
        Grig.chirping();


        // выводим вложенный класс
        System.out.println("Выволим вложенный класс");
        Bug.Body body = new Bug.Body();
        body.printBody();
    }


}