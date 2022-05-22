import java.util.Scanner;
class CalculatorOp{
	void operations() {
		//taking inputs from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		
		
		  System.out.println("Addition of 2 numbers is: "+(num1+num2));
		 System.out.println("Subtraction of 2 numbers is: "+(num1-num2));
	          
	      System.out.println("Multiplication of 2 numbers is: "+(num1*num2));
               
	     System.out.println("Division of 2 numbers is: "+(num1/num2));
                 
		System.out.println("Modulus of 2 numbers is: "+(num1%num2));
                   
		
		}
	}

public class CalculatorProg {
	public static void main(String[] args) {
		CalculatorOp c=new CalculatorOp();
		c.operations();
		
	}



}
