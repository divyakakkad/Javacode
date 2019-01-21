
public class Googlemap extends Googleuser {
	
	public  void showmap() {
		
		System.out.println("showmap functionality");
	}
	
	public Googlemap() {
		super();
		System.out.println("Child class constructor");
		
	}
	
	public void search() {
		System.out.println("Google map-search functionality");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Googlemap gm=new Googlemap();
		Googleuser gu1=new Googleuser();
		
		gm.login();
		gm.logout();
		gm.showmap();
		
		gu1.search();
		gm.search();
		

	}

}
