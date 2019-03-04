import java.util.Scanner;

public class stringtest{
	public static void main(String[] args){
		System.out.println("first word here:");
		Scanner _s1 = new Scanner(System.in);
		String s1 = _s1.next();
		System.out.println("second word here:");
		Scanner _s2 = new Scanner(System.in);
		String s2 = _s2.next();
//String could be combined by +
		System.out.println(s1+s2);
		
//string's special method
		System.out.println(s1.length()+s2.length());

//find the word's first appearance
		System.out.println(s1.indexOf("hello"));

//get the word by index		
		System.out.println(s2.charAt(3));
	}

}
