import java.io.*;

public class stringshit{

	public static void main(String[] args){
		Console console = System.console();
		String input = console.readLine();
		System.out.println("U just type:"+ input);
		System.out.println(input.length());
		System.out.println(input.equals("shit"));
		System.out.println(input.replaceAll("shit", "X"));
	}
}
