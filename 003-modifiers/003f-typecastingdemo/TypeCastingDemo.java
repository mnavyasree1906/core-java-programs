package modifierdemo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Implicit casting (smaller type to larger type)
        int intVal = 100;
        double doubleVal = intVal;  // Automatic conversion from int to double
        System.out.println("Implicit Casting: int to double = " + doubleVal);

        // Explicit casting (larger type to smaller type)
        double anotherDouble = 9.78;
        int intCast = (int) anotherDouble;  // Manual conversion from double to int
        System.out.println("Explicit Casting: double to int = " + intCast);
	}

}
