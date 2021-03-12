//Implementation of throw keyword in exception handling:
public class TestThrow {
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
		
	}
	public static void main(String[] args) {
		validate(15);
	    System.out.println("...Rest of code Continue...");
	    
		}

}
