
class car {
	String color;
	int reg_no;
	String engine;
	
	void run() {
		System.out.println("Car runs very fast");
	}

}
public class ex2{
	public static void main(String[] args) {
		car c=new car();
		car c2=new car();
		c.color="blue";
		c.reg_no=1122;
		c.engine="tata";
		c2.color="green";
		c2.reg_no=1123;
		c2.engine="dfg";
		System.out.println("color of car is:"+c.color);
		System.out.println("reg no of car is:"+c.reg_no);
		System.out.println("engine of car is:"+c.engine);
		System.out.println("color of car is:"+c2.color);
		System.out.println("reg_no of car is:"+c2.reg_no);
		System.out.println("engine of car is:"+c2.engine);
		
		
	}
}
