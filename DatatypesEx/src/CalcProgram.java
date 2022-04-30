import java.util.Scanner;
class Calculator{
	void operations() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:System.out.println("Addition of 2 numbers is: "+(num1+num2));
		       break;
		case 2: System.out.println("Subtraction of 2 numbers is: "+(num1-num2));
	           break;
		case 3: System.out.println("Multiplication of 2 numbers is: "+(num1*num2));
                break;
		case 4: System.out.println("Division of 2 numbers is: "+(num1/num2));
                 break;
		case 5: System.out.println("Modulus of 2 numbers is: "+(num1%num2));
                break;     
		case 6:System.exit(0);
		}
	}
}
public class CalcProgram {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		for(;;)
		{
			c.operations();
		}
	}



}
