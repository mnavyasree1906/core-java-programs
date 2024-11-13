# StaticDemo - Understanding Static Variables, Blocks, and Methods in Java

The `StaticDemo` class demonstrates the use of static variables, static blocks, and static methods in Java. Static members are associated with the class rather than any instance and load when the class is loaded into memory.

## StaticDemo.java

```java
package modifierdemo;

public class StaticDemo {
    private static int a;  // Static variable 'a'
    static int b = 50;     // Static variable 'b'

    // First static block
    static {
        System.out.println("First static block is executing.");
        a = b + 50;  // a = 50 + 50 = 100
    }

    // Second static block
    static {
        System.out.println("Second static block is getting executed.");
        int mul = a * b;  // mul = 100 * 50 = 5000
        System.out.println("The multiplied value of a, b is " + mul);
    }

    // Third static block
    static {
        System.out.println("Third static block is getting executed.");
        int mul = a * b + 100;  // mul = 100 * 50 + 100 = 5100
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
        System.out.println("Started executing the Sum method.");
        float r = c + d;  // r = c + d
        System.out.println("The result of the Sum is " + r);
    }

    public static void main(String[] args) {
        privateMethod();      // Call to private method
        publicMethod();       // Call to public method
        defaultMethod();      // Call to default method
        protectedMethod();    // Call to protected method
        Sum(5, 20.5F);        // Call to Sum method
    }
}
```
# Explanation of Static Members in StaticDemo

## Static Variables (`a` and `b`)

- **`a` and `b`** are static variables, meaning they are shared across all instances of the class.
- **`b`** is initialized with `50`, and **`a`** is assigned in the first static block as `a = b + 50`, resulting in `a = 100`.

## Static Blocks

1. **First Static Block**: Executes when the class is loaded, initializing `a` as `100`.
2. **Second Static Block**: Executes after the first, calculates `mul = a * b` (5000), and prints this value.
3. **Third Static Block**: Executes after the second, calculates `mul = a * b + 100` (5100), and prints this value.

## Static Methods

- **`privateMethod`**: Only accessible within `StaticDemo`.
- **`publicMethod`**: Accessible from any class.
- **`defaultMethod`**: Accessible only within the same package.
- **`protectedMethod`**: Accessible within the same package and by subclasses.
- **`Sum(int c, float d)`**: Calculates the sum of two parameters and prints the result.

## Example Output
When the main method is run, the output will be as follows:
```java
First static block is executing.
Second static block is getting executed.
The multiplied value of a, b is 5000
Third static block is getting executed.
The value of a * b + 100 is 5100
Private method is getting executed.
Public method is getting executed.
Default method is getting executed.
Protected method block is getting executed.
Started executing the Sum method.
The result of the Sum is 25.5
```
![image](https://github.com/user-attachments/assets/35aa0033-db9e-46bd-9421-235abce3c971)

---


