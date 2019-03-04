public class splitstring{
	public static void main(String[] args){
		String[] _data = {"abcdefghijklmnopqrstuvwxyz11231545/4354354354354a4354","abcdefghijklmn/opqrstuvwxyz"};
		for(String data : _data){
			String[] tokens = data.split("/");
			for(String token : tokens){
				System.out.print(token + "\t");
			}
			System.out.println();
		}	
	}

}
