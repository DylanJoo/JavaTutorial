public class ab_arr{
	public static void main(String[] args){

		int[][] arr = new int[8][4];
		arr[0] = new int[] {1,2,3,4,5};
		arr[1]= new int[] {99,100};	

		for (int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"-");
			}
		System.out.print("next\n");
		}
	}	

}

