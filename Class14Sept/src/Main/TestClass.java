package Main;

public class TestClass {
	
	public static void main(String[] args) {
		
	MyClass object = new MyClass();
	
	object.pubNonstatMethod();
	
	MyClass.pubStatMethod();
	
	MyClass.pubStatMethod();
	
	// Fix these
	
	MyClass.privStatMethod();
	
	object.pubNonstatMethod();
	
	MyClass.privStatMethod();
	
	object.privNonstatMethod();
	
	object.privNonstatMethod();
	
	}
}