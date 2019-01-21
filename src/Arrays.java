
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arrays example");
		
		int[] numbers= {1,2,3,4,5};
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(numbers[i]);
						
		}
		
		String [][] varNames= {{"A","Apple"},{"B","Boy"},{"C","Car"}};
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(varNames[i][j]);
			}
			
		}
		
//to print odd and even number
		
		int [] arr1= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < 10; i++) {
			
			if ((arr1[i] % 2)==0) {
				System.out.println(arr1[i] +" is even number");}
			else {
				System.out.println(arr1[i]+" is odd number");	
			
			}	
		}
		
		//to find largest number in an array
		
		
		int [] arr2= {10,20,25,37,30,35,32};
		
		int Large_number=arr2[0];
		for (int j = 0; j < 7; j++) {
			if (arr2[j]>Large_number) {
				Large_number=arr2[j];
			}
			
			
			
		}

		System.out.println("Largest number is "+Large_number);
		
		//to find the smallest in an array
		
	int [] arr3= {10,20,25,37,30,5,32};
		
		int Small_number=arr3[0];
		for (int j = 0; j < 7; j++) {
			if (arr3[j]<Small_number) {
				Small_number=arr3[j];
			}
			
			
			
		}

		System.out.println("Smallest number is "+Small_number);
		

		
		
		
	}

}
