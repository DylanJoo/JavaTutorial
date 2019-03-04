public class RequestDemo{
	public static void main(String[] args){
		doRequest(new HelloRequest("First Request"));
		doRequest(new WelcomeRequest("Second Request"));
		IRequest test = new HelloRequest("Third Request"); //interface 只是不能被initial，也可以當作型態帶入
		doRequest(test);
		IRequest a = new HelloRequest("AA");
		wired b = new HelloRequest("BB");
		a.execute();
		b.dowiredthing();
		wired c = (wired)a; //a轉形成搭配wired界面呈現
		c.dowiredthing();
		IRequest d = (IRequest)b;  //b轉形成搭配IRequest界面呈現
		d.execute();
		HelloRequest x = new HelloRequest("XXXXXX大魔王");
		x.execute();
		x.dowiredthing();

	}
	public static void doRequest(IRequest rq){ //只要有時做IRequest的都可以執行execute方法，依照各自實做
		rq.execute();	
	}
}

interface wired{
	public void dowiredthing();
}

class HelloRequest implements IRequest, wired{
	private String name;
	
	public HelloRequest(String name){
		this.name = name;	
	}
	public void dowiredthing(){
		System.out.println("哈囉，這邊做一個怪怪的界面");	
	}
	public void execute(){
		System.out.println("哈囉,這邊實做界面"+name);		
	}
}

class WelcomeRequest implements IRequest{
	private String place;
	public WelcomeRequest(String place){
		this.place = place;	
	}
	public void execute(){
		System.out.println("歡迎，這邊實做界面"+place);
	}
}

