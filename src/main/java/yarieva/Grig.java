package yarieva;

public class Grig extends Bug {

    public Grig(String name, int size, String color) {
        super(name, size, color);
    }

    public static void jump() {
        System.out.println("Прыгать");
    }

    public static void chirping() {
        System.out.println("Трещать");
    }
}