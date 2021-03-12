// implement Nested try block in java:

public class NestedTry {
	public static void main(String[] args) {
		int x;
		try {
		    try {
			 x =50/0;
		    }
		    catch(ArithmeticException e) {
	             System.out.println("Airthmetic Exception handled");              			
			}
		    try {
			int a[] =new int[5];
			a[6] =50;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound Exception handled");
		}
     }
        catch(Exception e) {
        	System.out.println("handled Safely");
        }
		System.out.println("code must be continued further");
		int a =7;
		int b=9;
		int temp;
		System.out.println("Numbers before swapping:a=7,b=9");
		temp=a;
		a=b;
		b=temp;
		System.out.println("Numbers after swapping:"+"a:"+a+","+ "b:"+b);
		
	}
}

