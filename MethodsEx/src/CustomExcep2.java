import java.util.Scanner;

//custom exception
class UnderAgeException extends Exception{
    public String toString() {
        return "Under Age";
    }
}
class OverAgeException extends Exception{
    public String toString() {
        return "Over Age";
    }
}
class Person{
	int age;
	void collect() {
		System.out.println("Enter your age");
		Scanner sc =new Scanner(System.in);
		age=sc.nextInt();
		
	}
	void verify() throws UnderAgeException,OverAgeException{
		if(age<18) {
			UnderAgeException ua=new UnderAgeException();
			System.out.println(ua.toString());
			throw ua;
		}
		else if(age>65) {
			OverAgeException oa=new OverAgeException();
			System.out.println(oa.toString());
			throw oa;
		}
		else {
			System.out.println("entered correct age");
		
		}
}
}
class Age{
    void agecheck() {
    	Person p=new Person();
    	p.collect();
    	try {
    	p.verify();	
    	}
    	catch (UnderAgeException e) {
			System.out.println(e.toString());
		}
    	catch (OverAgeException e) {
			System.out.println(e.toString());
		}
    }
}


public class CustomExcep2 {
   public static void main(String[] args) {
	Age ag=new Age();
	ag.agecheck();
}
}
