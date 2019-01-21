
public class Exceptionexample {
	static void res(int a,int b) {
	
	try {
		int res1=a/b;
		System.out.println("try block");
		
		System.exit(0);
		
	}
	
	
	
	catch(Exception e) {
		
		System.out.println("Catch block");
		
	}
	
	finally {
		System.out.println("Fnally block");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		res(10,0);
		

	}

}
