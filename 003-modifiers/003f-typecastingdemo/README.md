# TypeCastingDemo - Demonstration of Type Casting in Java

The `TypeCastingDemo` class demonstrates both implicit and explicit type casting in Java.

## TypeCastingDemo.java

```java
package modifierdemo;

public class TypeCastingDemo {

    public static void main(String[] args) {
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
```

## Explanation

1. **Implicit Casting (Widening)**:
   - **From int to double**: The `intVal` variable is automatically converted to `double` type in `doubleVal` without any data loss.
   - This conversion occurs from a smaller data type to a larger one, which is handled automatically by Java.

2. **Explicit Casting (Narrowing)**:
   - **From double to int**: The `anotherDouble` value is cast to an `int` using `(int)` before the variable name.
   - This conversion may result in data loss, as only the integer part is retained (e.g., `9.78` becomes `9`).

This example demonstrates how to safely convert between data types in Java, depending on whether you need automatic or manual conversions.

## Example Output
When the main method is run, the output will be as follows:
```java
Implicit Casting: int to double = 100.0
Explicit Casting: double to int = 9
```
![image](https://github.com/user-attachments/assets/1ec025df-bc62-475b-bd00-a24f804ca2be)

---
