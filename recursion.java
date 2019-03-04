import java.util.Scanner;

public class recursion{
	public static void main(String args[]){
		Scanner _scan = new Scanner(System.in);
		
		System.out.println("Enter two number:");
		System.out.println("m=");
		int m = _scan.nextInt();
		System.out.println("n=");
		int n = _scan.nextInt();
		System.out.print("\nGCD ="+gcd(m,n));
		foo f = new foo();
	}
	private static int gcd(int m, int n){
		if(n ==0)
			return m;
		else
			System.out.print("go");
			return gcd(n ,m%n);
	}
}

