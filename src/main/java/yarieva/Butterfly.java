package yarieva;

public class Butterfly extends Bug {


    public Butterfly(String name, int size, String color) {
        super(name, size, color);
    }

    public static void fly() {
        System.out.println("Летать");
    }

    public static void collectPollen() {
        System.out.println("Собирать пыльцу");
    }
}