public class gctest{
	private String name;
	
	public gctest(String name){
		this.name = name;
		System.out.println(name+"建立");	
	}

	protected void finalize(){
		System.out.println(name+"回收了");	
	}

	
	public static void main(String args[]){
		System.out.println("Press the CTRL+C to terminate the processes...");
	
		gctest g1 = new gctest("__FIRST__");
		gctest g2 = new gctest("__SECOND__");
		gctest g3 = new gctest("__THIRD__");

		g1 = null;
		g2 = null;
		g3 = null;
		
		System.gc();
	}
}


