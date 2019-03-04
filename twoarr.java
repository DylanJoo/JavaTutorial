import java.util.Scanner;

public class twoarr{

	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5,6,8,10}};
		for (int i = 0; i<arr.length; i++){
			for (int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"->");
			}
			System.out.print("\n");
		}
		
	}
}
