package yarieva;


public class Bug {
    public static String className = "Насекомое";
    private String name;
    private int size;
    private String color;

    //конструктор
    public Bug(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public static void sitDown() {
        System.out.println("Сидеть");
    }

    public static void printClassname() {
        System.out.println("Классификация" + " " + className);
    }

    public String getName() {
        return name;
    }

    // описание геттеров и сеттеров
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static class Body {
        static int head = 1;
        static int feet = 4;
        static int whiskers = 2;
        static int wings = 2;

        public void printBody() {
            System.out.println("Количество голов" + " " + head);
            System.out.println("Количество ног" + " " + feet);
            System.out.println("Количество усов" + " " + whiskers);
            System.out.println("Количество крыльев" + " " + wings);
        }


    }
}
