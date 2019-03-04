import java.io. *;

public class CheckedExceptionDemo{
	public static void main(String[] args){
		try{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Integer:");
			int input = Integer.parseInt(buf.readLine());
			System.out.println("input * 10 = " + (input*10));
		}
		catch(IOException e){
			System.out.print("I/O錯誤");		
		} //checked exception
		catch(NumberFormatException e){	
			System.out.print("輸入必須為整數");
		} //runtime exception
	}
}
