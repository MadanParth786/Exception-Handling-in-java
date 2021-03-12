// implement final block                          
public class FinallyBlock {
	static int sub(int a,int b) {
		int x;
		x=a-b;
		return x;
	}
	public static void main(String[] args) {
		int value;
		try {
		int x =40/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
			
		}
		
		finally {
			System.out.println("Finally block executes always");
		}
		value = FinallyBlock.sub(4,2);
		System.out.println(value);
		
	}

}
