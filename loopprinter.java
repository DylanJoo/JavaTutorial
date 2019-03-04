import java.util.Scanner;

public class loopprinter{
	public static void main(String[] args){
		Scanner _j = new Scanner(System.in);
		int j = _j.nextInt();
		for (int i = 0; i<j ; i++)
			System.out.print(i+"_");	
	}
}
