import java.util.*;

public class StringExamples {

	 static void stringDemo() {
		
		String name="Java";
		String name1="java";
		System.out.println("length of the string is"+name.length());
	System.out.println("Substring"+name.substring(2));
		System.out.println("character at position"+name.charAt(3));
	System.out.println("Replace character"+name.replace('a', 'A'));
		System.out.println("Position value of v "+name.indexOf('v'));
		System.out.println("Position value of a"+name.indexOf('a'));
		String var1= "TrishanaTechnologies";
		String var2="";
		System.out.println("Substring"+var1.substring(8, var1.length()));
	//trim,compareto,
		System.out.println(name.compareToIgnoreCase(name1));
			
		
		for (int j = var1.length()-1; j >= 0; j--) {
			var2=var2+var1.charAt(j);
		
		}
		if (var1==var2)
			System.out.println("Palindrome");
		System.out.println(var2);
	}
	 
	 static void StringsDemo(String s) {
		 s=s+"world";
		 System.out.println("From String"+s);
	 }
	 static void stringsBufferDemo(StringBuffer sb1) {
		 sb1=sb1.append("world");
		 System.out.println(sb1);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.pow(2, 2));
		Date d=new Date();
		System.out.println(d);
		StringExamples.stringDemo();
		/*StringExamples se=new StringExamples();
		se.stringDemo();
		*/
		
	String s1="Hello";
	System.out.println(s1);
	StringsDemo(s1);
	System.out.println(s1);
	StringBuffer sb=new StringBuffer("Hi");
	System.out.println(sb);
	stringsBufferDemo(sb);
	System.out.println(sb);
	


	}

}
