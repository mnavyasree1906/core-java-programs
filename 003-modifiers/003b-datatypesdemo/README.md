# DataTypesDemo - Primitive Data Types in Java
This example demonstrates the use of primitive data types in Java. Each data type is assigned a sample value and then printed to the console.

#### Code:

```java

package modifierdemo;
public class DataTypesDemo {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVal = 10;           // 8-bit integer, range: -128 to 127
        short shortVal = 200;        // 16-bit integer, range: -32,768 to 32,767
        int intVal = 1000;           // 32-bit integer, range: -2^31 to 2^31 - 1
        long longVal = 10000L;       // 64-bit integer, range: -2^63 to 2^63 - 1 (suffix 'L' for long)
        float floatVal = 10.5f;      // 32-bit floating-point number (suffix 'f' for float)
        double doubleVal = 99.99;    // 64-bit floating-point number, default for decimal values
        char charVal = 'A';          // 16-bit character (Unicode character)
        boolean boolVal = true;      // Boolean type, values can be true or false

        // Print values of different data types
        System.out.println("Byte Value: " + byteVal);
        System.out.println("Short Value: " + shortVal);
        System.out.println("Int Value: " + intVal);
        System.out.println("Long Value: " + longVal);
        System.out.println("Float Value: " + floatVal);
        System.out.println("Double Value: " + doubleVal);
        System.out.println("Char Value: " + charVal);
        System.out.println("Boolean Value: " + boolVal);
    }
}
```

### Explanation:

In this program:
1. Primitive Data Types: Each variable is assigned a sample value demonstrating Java's primitive data types:
- byte, short, int, and long: Integer types with different ranges and storage capacities.
- float and double: Floating-point types for decimal values. float uses an f suffix.
- char: Stores a single character.
- boolean: Stores a true or false value.
2. Printing Values: The program uses System.out.println to display each variable's value on the console.

### Expected Output:
Running this program will print the values of each data type:
```java

Byte Value: 10
Short Value: 200
Int Value: 1000
Long Value: 10000
Float Value: 10.5
Double Value: 99.99
Char Value: A
Boolean Value: true
```

![image](https://github.com/user-attachments/assets/bb2645ce-7f20-4c6d-a390-ddf7968c3485)


---


