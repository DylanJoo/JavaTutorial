public class AnonymousDemo{
	public static void main(String[] args){
		Object obj = new Object(){
			public String toString(){
				return "匿名類別物件";//如果匿名類別要用外部變數，外變數要宣告成final才行
			}
		};//繼承object的一個沒有名字的類別（直接把類別的細節打在後面的大括號）
		System.out.print(obj);
	}	
}
