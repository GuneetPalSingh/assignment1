
class Dog {
	String name;
	String color;
	int cost;
	String breed;
	int age;
	
	void eat() {
			System.out.println("Dog eats");
	}
	
	}
public class ex1{
	public static void main(String[] args) {
		Dog d= new Dog();
		System.out.println("object address is"+d);
		d.name="Tommy";
		d.color="white";
		d.cost=3000;
		d.age=2;
		d.breed="GR";
		
		System.out.println("name of the dog is: "+d.name);
		System.out.println("color is: "+d.color);
		System.out.println("cost is: "+d.cost);
		System.out.println(d.age);
		System.out.println(d.breed);
		
		d.eat();
	}
}