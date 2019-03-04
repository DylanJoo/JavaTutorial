public class table implements Cloneable{
	private point center;
	
	public void setCenter(point center){
		this.center = center;	
	}
	public point getCenter(){
		return center;	
	}
	public Object clone() throws CloneNotSupportedException{
		table table = (table) super.clone(); //呼叫物件的clone方式，要轉形成table物件
		if(this.center != null){
			table.center = (point)center.clone(); //point clone是物件，要轉形成點物件	
		}
		return table;
	}
}
