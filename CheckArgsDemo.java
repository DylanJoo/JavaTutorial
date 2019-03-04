public class CheckArgsDemo{
	public static void main(String[] args){
		try{
			System.out.print("EXECUTE FOLLOWING INSTRUCION..." + args[0]);		
		} //命令引數放在跑cmd時，java XXXX "Here is 引數." 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("NO ARGUMENT.");
			e.printStackTrace();	
		}//使用例外處理，不使用if判斷式，因為不需要把錯誤的例外當作每次都必須判斷的過程，讓例外指出現在系統上真的有錯誤時才跳出！	
	}
}
