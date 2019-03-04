import java.util.Arrays;

public class arrfill{
	public static void main(String[] args){

		int[] arr1 = new int[10];
		int[] arr2 = new int[] {1,2,3,4,5,6,7};

		Arrays.fill(arr1, 5);
		Arrays.fill(arr2, 7);

		int i = 0;
		while (i < arr1.length){
			System.out.println(arr1[i++]);
		}
		int j = 0;
		while (j < arr2.length){
			System.out.println(arr2[j++]);
		}
	}
}
