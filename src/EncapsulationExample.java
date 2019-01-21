
public class EncapsulationExample {
	
	private double totalbalance=10000;
	
	
	public void getTotalbalance() {
		System.out.println(totalbalance);
	}



	public void setTotalbalance(double totalbalance) {
		this.totalbalance = totalbalance;
		System.out.println(totalbalance);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationExample ee=new EncapsulationExample();
		
		ee.getTotalbalance();
		
		ee.setTotalbalance(2000);
		

	}

}
