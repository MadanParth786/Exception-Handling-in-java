//Implement Throws keyword and its role in exception handling through code.
import java.io.IOException;
public class Throws_keyword {
	static void method1() throws IOException{
		throw new IOException("System Error");   //Checked Exception
	}
	static void method2() throws IOException{
		method1();
	}
	static void method3() {
		try {               // implement exception propogation
			method2();
		}
		catch(Exception e) {
			System.out.println("Exception Handled!");
		}
	}
	public static void main(String[] args) {
		method3();
		System.out.println("Code Continue Further...");
		
	}

}
