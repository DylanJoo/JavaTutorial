import java.util.Arrays;

public class arr_update{
	public static void main(String[] args){
		int[] array = new int[] {5,2,4,1,3};
		int[] alter = array;
		for (int i = 0; i<alter.length; i++){
			System.out.print(alter[i]+"-->");
		}
		System.out.println("\nChange the original array by reference...");

		alter[4] = 99;
		Arrays.sort(alter);
		
		for (int i = 0; i<array.length; i++){
			System.out.print(array[i]+"-->");
		}
		
	}

}
