

abstract class bike {
	
	 abstract void run();  
	
}

public class AbstractExample  extends bike  {
	void run(){
		System.out.println("running safely");
		} 
	



	public static void main(String[] args) {
		 bike obj = new AbstractExample(); 
		obj.run();

	}
}


