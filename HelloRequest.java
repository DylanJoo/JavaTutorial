public class RequestDemo{
	public static void main(String[] args){
			
	}
}

class HelloRequest implements IRequest{
	private String name;
	
	public HelloRequest(String name){
		this.name = name;	
	}
	public void exceute(){
		System.out.println("哈囉,這邊實做界面"+name);		
	}
}

class WelcomeRequest implements IRequest{
	private String place;
	public WelcomeRequest(String place){
		this.place = place;	
	}
}

