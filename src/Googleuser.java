
public class Googleuser {
	
public void login() {
	System.out.println("login functionality");
	
}
public void logout() {
	System.out.println("logout functionality");
	
}

public void search() {
	System.out.println("Google user-search functionality");
}


	public Googleuser() {
	
	System.out.println("Superclass constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Googleuser gu=new Googleuser();
		gu.login();
		gu.logout();

	}

}
