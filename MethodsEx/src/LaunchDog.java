class Dog extends Object
{
    //Properties
    String name;
    int cost;
    String color;
    String breed;
    public Dog() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Dog(String name) {
        super();
        this.name = name;
    }
    public Dog(String name,int cost) {
        super();
        this.name = name;
        this.cost = cost;
    }
    public Dog(String name, int cost, String color) {
        super();
        this.name = name;
        this.cost = cost;
        this.color = color;
    }
    public Dog(String name, int cost, String color,String breed) {
        super();
        this.name = name;
        this.cost = cost;
        this.color = color;
        this.breed = breed;
    }

//Activity
    void run() {
        System.out.println("Dog runs");
    }
    void eat() {
        System.out.println("Dog eats");
    }
    void disp() {
        System.out.println(name);
        System.out.println(cost);
        System.out.println(color);
        System.out.println(breed);
    }
}
public class LaunchDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.disp();
        System.out.println("-----------------");
        Dog d2 = new Dog("Rocky");
        d2.disp();
        System.out.println("-----------------");
        Dog d3 = new Dog("Tommy",5000);
        d3.disp();
        System.out.println("-----------------");
        Dog d4 = new Dog("Jimmy", 7000, "white");
        d4.disp();
        System.out.println("-----------------");
        Dog d5 = new Dog("Jerry", 8000, "gold", "GR");
        d5.disp();
    }
}
