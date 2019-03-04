public class clonedemo{
	public static void main(String[] args) throws CloneNotSupportedException{
		table t1 = new table();
		point p1 = new point(9,9);
		t1.setCenter(p1);
		point originalcenter = t1.getCenter();

		table t2 = (table)t1.clone();
		point p2 = t2.getCenter();  //把p2交給t2的中心？
		point p3 = p2;	      //例如把點p3 等於 p2，代表p3指向和p2一樣的物件位置。
		System.out.println("t2的中心點\n"+ t2.getCenter());
		System.out.println("p2的點複製t2中心點\n" + p2);
		System.out.println("p3的點複製p2的點\n"+p3);
		
		point p = t1.getCenter();
		System.out.println(p.getX()+p.getY());
		p = t2.getCenter();
		System.out.println(p.getX()+p.getY());

		p2.setX(100);
		p2.setY(100);
		p3.setX(999999);
		t2.getCenter().setX(777);
		//所以更改任一個點，都會改到該記憶體內的內容
	
		p = t1.getCenter();
		System.out.println(p.getX()+p.getY());
		p = t2.getCenter();
		System.out.println(p.getX()+p.getY());
	}
}
