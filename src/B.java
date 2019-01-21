
 
public class B {
	
	void div(int a,int b) throws Exception {
		
		
		int res=a/b;
		
				
		System.out.println("Result"+res);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		try {b.div(10, 0);
		
		
		}
		
		
		catch (Exception e){
			System.out.println("Exception occured");
		}
		
		finally {
			System.out.println("Calculation completed");
		}
		

	}

}
