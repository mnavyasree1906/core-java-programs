package modifierdemo;

public class StaticDemo {
	 private static int a;  // static variable 'a'
	    static int b = 50;     // static variable 'b'

	    // First static block
	    static {
	        System.out.println("First static block is executing.");
	        a = b + 50;  // a = 50 + 50 = 100
	    }

	    // Second static block
	    static {
	        System.out.println("Second static block is getting executed.");
	        int mul = a * b;  // mul = 100 * 50 = 5000
	        System.out.println("The multiplied value of a,b is " + mul);
	    }
	    //Third static block
	    static {
	    	System.out.println("Third static block is getting exectucted.");
	    	int mul = a * b + 100; //mul = 100 * 50 + 100 = 
	    	System.out.println("The value of a * b + 100 is " + mul);
	    }

	    // Static methods
	    private static void privateMethod() {
	        System.out.println("Private method is getting executed.");
	    }

	    public static void publicMethod() {
	        System.out.println("Public method is getting executed.");
	    }

	    static void defaultMethod() {
	        System.out.println("Default method is getting executed.");
	    }

	    protected static void protectedMethod() {
	        System.out.println("Protected method block is getting executed.");
	    }

	    public static void Sum(int c, float d) {
	        System.out.println("Started executing the Sum method");
	        float r = c+ d;  // r = c + d
	        System.out.println("The result of the Sum is " + r);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 privateMethod();     // Call to private method
	        publicMethod();      // Call to public method
	        defaultMethod();     // Call to default method
	        protectedMethod();    // Call to protected method
	        Sum(5, 20.5F);       // Call to Sum method
	}

}
