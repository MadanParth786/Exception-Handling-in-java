// exception handling using try catch blocks
//Excepton handling using multiple catch blocks.
public class tryblock {
	public static void main(String[] args) {
		//int data  =40/0;                       
		//System.out.println(data); 
		//System.out.println("Hello Everyone");
		// to remove the above scenerio we inroduce try and catch blocks which handle with exceptions.
		try {
		//int x =17/0;
		int a[] = new int[5];
		a[6] =40;
	}
	   catch(ArithmeticException e) {
	    	System.out.println("Task 1 completed");
	    }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		}
		System.out.println("rest of the code is Working");
        int x =50,y=70;
        int sum = x+y;
        System.out.println(sum);
        		
		
}
	
}	
