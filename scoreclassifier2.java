import java.util.Scanner;


public class scoreclassifier2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double result = input.nextInt();
		int grade = (int)result/10;
		
		switch(grade){
			case 10:System.out.printf("U got %.2f ,which means A", result);break;
			case 9:System.out.printf("U got %.2f, which means B", result);break;
			case 8:System.out.printf("U got %.2f, which means C", result);break;
			case 7:System.out.printf("U got %.2f, which means D", result);break;
			default:System.out.printf("U got %.2f, which means FAILED", result);break;
		}	
	}
}
