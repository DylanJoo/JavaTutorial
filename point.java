public class point implements Cloneable{
	private int x;
	private int y;
	private static int z;//只會被固定一次，整個類別的變數，不管物件是那一個，都一樣，只會看最後定義一次定義
	public point(){};
	public point(int x, int y){
		this.x = x;
		this.y = y;	
	}
	public void setX(int x){this.x = x;}
	public int getX(){return x;}
	public void setY(int y){this.y = y;}
	public int getY(){return y;}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args){

		point p1 = new point(5,5);
		point p2 = new point(9,9);	
		p1.setX(100);
		
		System.out.println(p1.getX());
		System.out.println(p2.getX());
	}
}
