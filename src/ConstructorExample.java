
public class ConstructorExample {
	String name;
	String gender;
       
	public  ConstructorExample() {
		
		System.out.println("default constructor");
		this.name="default constructor";
		
		
	}
	
	public ConstructorExample(String str1,String str2) {
		
		this.name=str1;
		this.gender=str2;
		
		
	}
	
	void info() {
		System.out.println("Name"+name+"gender"+gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample ce=new ConstructorExample();
		System.out.println(ce.name);
		
		ConstructorExample ce1=new ConstructorExample("Divya","Female");
		ce1.info();
			

	}

}
