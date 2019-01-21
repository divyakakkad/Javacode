
interface Drawable{
	void draw();
	
}

class Rectangle implements Drawable{
	
	public void draw() {
	System.out.println("Drawing Rectangle");
	}
}

class Circle implements Drawable{
	
	public void draw() {
	System.out.println("Drawing circle");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle obj=new Rectangle();
		obj.draw();
		

	}

}
