//implementation of Exception Propogation in java
public class ExceptionPropogation {
	void method1() {
		int x = 40/0;
	}
	void method2() {
		method1();
	}
	 void method3() {
		try {
			method2();
			}
		catch(Exception e) {
			System.out.println("Exception handled");
			System.out.println("Exception occured in method 1 and handled in method 3 that is Exception Propogation");
			
		}
	}
public static void main(String[] args) {
	ExceptionPropogation obj = new ExceptionPropogation();
	obj.method3();
}
}
