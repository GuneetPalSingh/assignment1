
public class Code1 {
	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("value of a: "+a);
		int b=a;
		System.out.println("vaue of b: "+b);
		float c=a;
		System.out.println("value of c: "+c);
		long d=a;
		System.out.println("value of d: "+d);
		double e=a;
		System.out.println("value of e: "+e);
		System.out.println("\n");
		System.out.println("explicit type casting");
		//explicit conversion
		double x=45.5;
		long ld=5;
		int z=(int)ld;
		int y=(int)x;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		System.out.println("value of z: "+z);
	}
}
