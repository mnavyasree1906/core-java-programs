# ModifierDemo - Understanding Access Modifiers in Java

The `ModifierDemo` class demonstrates the four main access modifiers in Java: `public`, `private`, `protected`, and default (package-private). Each modifier controls the visibility of variables and methods within and across classes and packages.

## ModifierDemo.java

#### code:
```java
package modifierdemo;

public class ModifierDemo {
    public int publicVar = 10;            // Accessible from anywhere
    private int privateVar = 12;          // Accessible only within this class
    protected int protectedVar = 13;      // Accessible within this class, same package, and subclasses
    int defaultVar = 14;                  // Accessible only within the same package

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

    public static void main(String[] args) {
        ModifierDemo demo = new ModifierDemo();
        System.out.println("Public Variable: " + demo.publicVar);
        demo.publicMethod();
        System.out.println("Protected Variable: " + demo.protectedVar);
        demo.protectedMethod();
        System.out.println("Default Variable: " + demo.defaultVar);
        demo.defaultMethod();
        // Note: privateVar and privateMethod() are not accessible outside this class
    }
}
```

## Explanation of Access Modifiers
In this example:
1. Public (`publicVar` and `publicMethod()`):
- Can be accessed from any class, inside or outside the package.
2. Private (`privateVar` and `privateMethod()`):
- Accessible only within the `ModifierDemo` class, making it the most restrictive modifier.
- Neither the variable `privateVar` nor `privateMethod()` can be accessed in the `main` method.
3. Protected (`protectedVar` and `protectedMethod()`):
- Can be accessed within the same package and by subclasses in other packages.
4. Default (Package-Private) (`defaultVar` and `defaultMethod()`):
- No modifier is specified, so the default access level applies.
- Accessible only within the `modifierdemo` package and cannot be accessed outside of it.

### Example Output:

When you run the main method, it will output:
```java
Public Variable: 10
This is a public method
Protected Variable: 13
This is a protected method
Default Variable: 14
This is a default method
```
#### Note: `privateVar` and `privateMethod()` cannot be accessed outside of `ModifierDemo`, so they are not included in the output.

![image](https://github.com/user-attachments/assets/47ed7168-33e9-49a5-968e-53cef6855b8d)

---
