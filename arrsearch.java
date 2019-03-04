import java.util.Scanner;
import java.util.Arrays;

public class arrsearch{
		
	public static void main(String[] args){
		System.out.println("Enter a key value that u want to search");
		Scanner _key = new Scanner(System.in);
		int key = _key.nextInt();

		//find from the assigned array.
		int[] arr = {93, 5, 3, 55, 57, 7, 2 ,73, 41, 91};
		for (int i =0; i <arr.length; i++){
			if (arr[i] == key)
				System.out.printf("U got it at %d place.\n", i+1);
		}

		//Using Binarysearch
		Arrays.sort(arr);
		System.out.print(Arrays.binarySearch(arr, key)+1);
		
	}
		
}
