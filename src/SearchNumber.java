
public class SearchNumber {
	
	static void search() {
		int num[]= {1,2,3,5,8,6,9,10};
		int searchnum=6,flag=0,pos=0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]==searchnum) {
				flag=1;
			pos=i+1;
			break;}
				else
					flag=0;
			}
		
		if (flag==1)
			System.out.println("Number "+searchnum+" is present in the array and the position is:"+pos);
		else
			System.out.println("The number is not present in the array");
			
		}
	
	static void swapformula1() {
		int a =10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+" b:"+b);
		
	}
	static void swapformula2() {
		int a =30,b=40;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a:"+a+" b:"+b);
		
	}
	
	static void swaptemp() {
		int a =50,b=60,temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a:"+a+" b:"+b);
		
	}
		
	
	static void stringswap() {
		String sb1,sb2;
		StringBuilder sb=new StringBuilder("Hello");
		StringBuilder strswap=sb.append("hi");
		System.out.println(strswap);
		sb1=strswap.substring(5,7);
		sb2=strswap.substring(0, 5);
		
	
		System.out.println("After swapping string1:"+sb1+" & String2:"+sb2);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchNumber.search();
		SearchNumber.swapformula1();
		SearchNumber.swapformula2();
		SearchNumber.swaptemp();
		SearchNumber.stringswap();
		

	}

}
