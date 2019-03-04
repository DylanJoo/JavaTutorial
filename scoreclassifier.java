import java.util.Scanner;


public class scoreclassifier{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean result = input.nextInt()>60;
		if (result)
			System.out.println("YOU PASS");
		else
			System.out.println("YOU FAILED");
		
	}
}
