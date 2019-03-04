import java.util.Scanner;
import java.io.Console;

public class console{

	public static void main(String[] args){

		Console console = System.console();
		System.out.println("Enter Something Please");	
		String name = console.readLine();
		System.out.println(name);
	}
}
