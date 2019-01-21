
public class Palindrom {
	
	static void palindrome() {
		
	
	String strpal="RACECAR";
	String var2="";
	
	for (int j = strpal.length()-1; j >= 0; j--) {
		var2=var2+strpal.charAt(j);
	
	}
	System.out.println("Reversed String"+var2);
	
	if (var2.compareToIgnoreCase(strpal)==0) {
		System.out.println("String is palindrome");}
		else {
			System.out.println("String is not palindrome");}
			
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrom.palindrome();	

	}

}
