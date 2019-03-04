public class tostring{
		
	public static void main(String args[]){
		StringBuilder sb1 = new StringBuilder();
	
		for(int i = 0; i < 100; i++){
			sb1.append(i);
		}
		System.out.println(sb1.toString());
	}
}
