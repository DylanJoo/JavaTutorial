import java.util.Scanner;

public class oddoreven{
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);
		int finalvalue = value.nextInt();
		System.out.printf("你輸入的是：%d\n", finalvalue);
		System.out.println("EVEN or NO?");
		System.out.println((finalvalue % 2 == 0));
			
	}
}
