import java.util.Scanner;
import java.io.*;

public class regularexpress{
	public static void main(String args[]){

		Scanner _input = new Scanner(System.in);

		String phoneEL = "[0-9]{4}-[0-9]{6}";
		String emailEL = "^[_a-z0-9-]+(.[_a-z0-9-]+)*"+"@[a-z0-9-]+([.][a-z0-9-]+)*$";		

		System.out.println("abcdefghijklmnopqestuvwxz".replaceAll(".bc", "###"));
		System.out.println("PHONE CHECK");

		String input = _input.nextLine();
		if(input.matches(phoneEL))
			System.out.println("PASS");
		else
			System.out.print("FAILED");
		
		System.out.println("EMAIL CHECK");
		input = _input.nextLine();
		if(input.matches(emailEL))
			System.out.println("PASS");
		else
			System.out.print("FAILED");
	}
}
