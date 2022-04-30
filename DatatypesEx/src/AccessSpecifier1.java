class defAccessSpecifier
{
	void display() {
		System.out.println("You are using default access specifier");
	}
}
class defPAcessSpecifier{
	private void display() {
		System.out.println("You are using private access specifier");
	}
}
class defprotAcessSpecifier{
	protected void display() {//available within same package and also inheritance class
		System.out.println("You are using protected access specifier");
	}
}


public class AccessSpecifier1 {
public static void main(String[] args) {
	System.out.println("Default Acess Specifier");
	defAccessSpecifier obj1=new defAccessSpecifier();
	obj1.display();
	
	System.out.println("private acess specifier");
	defPAcessSpecifier obj2=new defPAcessSpecifier();
	//obj2.display();
	
	System.out.println("protected acess specifier");
	defprotAcessSpecifier obj3=new defprotAcessSpecifier();
	obj3.display();
	
			
}
}
