import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	
	static void arraylist() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay"); 
		  
		//Iterator itr=list.iterator();
		
		/*while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		  
		  for (String name : list) {
			System.out.println(name);
		}
		  
		  ArrayList<String> list1=new ArrayList<String>();
			list1.add("Appleeee");
			list1.add("Vijayeee");  
			  list1.add("Ravieee");  
			  list1.add("Ajayee"); 
		  
	
	
	  for (String name1 : list1) {
			System.out.println(name1);
		}
	  
	  list.addAll(list1);
	  
	  System.out.println(list);
	  
	  if (list.contains("null"))
		  
		  System.out.println("pass");
	  else
		  System.out.println("fail");
	  
	}
	

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arraylist();
		

	}

}
