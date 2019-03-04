public class PointDemo{
//內部類別start
	private class Point{
		private int x, y;
		public Point(){
		}
		public void setPoint(int x, int y){
			this.x = x;
			this.y = y;	
		}
		public int getX(){return x;}
		public int getY(){return y;}
	}

//外界不需要知道point類別的存在，也不會被知道裡面的設計，但又可以拿到回傳，就像看不到的composition
//內部類別end
//主要類別start
	private Point[] arr; //宣個一個point類別的陣列，裡面擺放point物件

	public PointDemo(int length){ 
		arr = new Point[length]; //demo宣告，決定arr的長度

		for(int i = 0; i < arr.length; i++){
			arr[i] = new Point(); //建立一個物件擺進去
			arr[i].setPoint(i*5, i*5);//改變pointarr中的point物件，並修改內容成：00 55 1010 1515...
		}
	
	}
	public void showPoint(){
		for(int i = 0; i < arr.length; i++){
			System.out.println("Point is (" + arr[i].getX() + "," + arr[i].getY() + ")");	
		}	
	}
	public static void main(String[] args){
		PointDemo t1 = new PointDemo(10);
		t1.showPoint();
	}//正常應該要把這格實作主程式放到個新的class啦，但這樣也可以
}
