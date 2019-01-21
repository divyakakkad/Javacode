import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
	
	static void mapdemo() {
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("A","Apple");
		 m1.put("B","Amit");  
		  m1.put("C","Vijay");  
		  m1.put("D","Rahul");  
		  
		  System.out.println(m1);
		  
		  System.out.println(m1.keySet());
		  System.out.println(m1.containsKey("D"));
		  
		  System.out.println(m1.getOrDefault("D", "Divya"));
		  
		  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          mapdemo();
          
	}

}
