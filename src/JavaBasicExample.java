//static example without creating the object
public class JavaBasicExample {
int c;
static int sum=0;
static {
	System.out.println("static block");
}
static String Name="Static field";

	static void add(int a,int b) {
		int Sum=0;
		Sum=a+b;
		//System.out.println("a value"+c);
		System.out.println("Sum:"+Sum);
	}
	 void multipyl(int a,int b) {
		 System.out.println(Name);
		 System.out.println("result"+(a*b));
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		JavaBasicExample e=new JavaBasicExample();
		e.multipyl(10, 20);
		

	}

}
