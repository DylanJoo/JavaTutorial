import java.util.Scanner;
import java.io.Console;

public class console{

	public static void main(String[] args){

		Console console = System.console();
		String name = console.readLine();


		System.out.println(name);
	}
}
