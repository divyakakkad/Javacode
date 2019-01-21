
public class OverloadingExample {
	
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum of 2 number:"+sum);
	}
	
	public void  add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum of 3 numbers:"+sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExample oe=new OverloadingExample();
		oe.add(10, 20);
		oe.add(10, 20, 30);

	}

}
