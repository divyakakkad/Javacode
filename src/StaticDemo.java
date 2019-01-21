
public class StaticDemo {
	static int a=10;
	static int b=20;
	
	static {
		System.out.println("block1");
		 int Mul=a*b;
		 int addvar=a+b;
		System.out.println(Mul);
		System.out.println(addvar);                          
		
		
	}
	static {
		System.out.println("block2");
	}
	
	static {
		System.out.println("block3");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
	}

}
