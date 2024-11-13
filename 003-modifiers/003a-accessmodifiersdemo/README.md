# AccessModifiersDemo and ModifierDemo Example

This repository demonstrates how different access modifiers (public, protected, default (package-private), and private) control the accessibility of variables and methods in Java classes.

## Files in this Repository
- AccessModifiersDemo.java: Demonstrates access to different variables and methods within the same class and package.
- ModifierDemo.java: Contains variables and methods with different access levels.

## Code Overview
### AccessModifiersDemo.java
This class defines variables with each type of access modifier and demonstrates their accessibility within the same class. It also creates an instance of ModifierDemo to demonstrate access to variables and methods from another class in the same package.
package modifierdemo;

```java

public class AccessModifiersDemo {
    public int publicVar = 1;          // Accessible from anywhere
    protected int protectedVar = 2;    // Accessible within package and subclasses
    int defaultVar = 3;                // Accessible only within the same package
    private int privateVar = 4;        // Accessible only within this class

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        // Accessing variables within the same class
        System.out.println("Public Variable: " + demo.publicVar);
        System.out.println("Protected Variable: " + demo.protectedVar);
        System.out.println("Default Variable: " + demo.defaultVar);
        System.out.println("Private Variable: " + demo.privateVar);

        // Creating an instance of ModifierDemo to access its methods
        ModifierDemo modifierDemo = new ModifierDemo();

        // Accessing ModifierDemo's public variable and method
        System.out.println("Accessing ModifierDemo's Public Variable: " + modifierDemo.publicVar);
        modifierDemo.publicMethod();

        // Accessing ModifierDemo's protected variable
        System.out.println("Accessing ModifierDemo's Protected Variable: " + modifierDemo.protectedVar);

        // Accessing ModifierDemo's default variable and method
        System.out.println("Accessing ModifierDemo's Default Variable: " + modifierDemo.defaultVar);
        modifierDemo.defaultMethod();
    }
    }

```
### ModifierDemo.java
This class defines variables and methods with different access levels to show which are accessible from within the same package and which are not.

```java

package modifierdemo;  // Ensure this is at the top

public class ModifierDemo {
    public int publicVar = 10;    // Can be accessed from anywhere
    private int privateVar = 12;  // Can be accessed only within this class
    protected int protectedVar = 13; // Can be accessed within this class and subclasses
    int defaultVar = 14; // Accessible only within the same package

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }
}

```

### Explanation
- Public members (publicVar and publicMethod()) are accessible from any class.
- Protected members are accessible within the same package and subclasses.
- Default (package-private) members are accessible only within the same package.
- Private members are accessible only within the class they are defined in.

### Expected Output
Running the AccessModifiersDemo class will display the values of accessible variables and methods from both classes:

```java
Public Variable: 1
Protected Variable: 2
Default Variable: 3
Private Variable: 4
Accessing ModifierDemo's Public Variable: 10
This is a public method
Accessing ModifierDemo's Protected Variable: 13
Accessing ModifierDemo's Default Variable: 14
This is a default method

```
![image](https://github.com/user-attachments/assets/d2da626d-34ad-48f3-98a6-0debfd7b6619)
