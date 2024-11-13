package modifierdemo;  // Ensure both classes are in the same package

public class AccessModifiersDemo {
    public int publicVar = 1;    // Can be accessed from anywhere
    protected int protectedVar = 2; // Can be accessed within this class and subclasses
    int defaultVar = 3; // Accessible only within the same package
    private int privateVar = 4; // Accessible only within this class

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        
        // Accessing variables from this class
        System.out.println("Public Variable: " + demo.publicVar);
        System.out.println("Protected Variable: " + demo.protectedVar);
        System.out.println("Default Variable: " + demo.defaultVar);
        System.out.println("Private Variable: " + demo.privateVar); // Accessing the private variable

        // Creating an instance of ModifierDemo to access its methods
        ModifierDemo modifierDemo = new ModifierDemo(); // This line should work if everything is correct
        
        // Accessing ModifierDemo's public variable
        System.out.println("Accessing ModifierDemo's Public Variable: " + modifierDemo.publicVar);
        modifierDemo.publicMethod(); // Accessing public method
        
        // Accessing ModifierDemo's protected variable and method
        System.out.println("Accessing ModifierDemo's Protected Variable: " + modifierDemo.protectedVar);
        
        // Accessing ModifierDemo's default variable and method
        System.out.println("Accessing ModifierDemo's Default Variable: " + modifierDemo.defaultVar);
        modifierDemo.defaultMethod(); // Accessing default method
    }
}
