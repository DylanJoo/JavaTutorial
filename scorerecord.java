import java.util.Scanner;
import java.io.*;

public class scorerecord{
	public static void main(String[] args){
		float[] table = new float[10];
		//int [] table = {100,92,83};		

		System.out.println("Enter the name:");
		Console _num2 = System.console();	
		int num2 = Integer.parseInt(_num2.readLine());
		System.out.println(num2+3);
		//put the string object to integer object, then parse it to the int value.

		System.out.println("Enter the sum of the students:");
		Scanner _num = new Scanner(System.in);
		int num = _num.nextInt();

		for (int i = 0; i < num ; i++){
			Scanner _record = new Scanner(System.in);
			table[i] = _record.nextFloat();
		}				
		for (int i = 0; i < num ; i++){
			System.out.println(table[i]);
		}
	}
}
