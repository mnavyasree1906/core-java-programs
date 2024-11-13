# StringConcatDemo - String Concatenation in Java

The `StringConcatDemo` class demonstrates different ways to concatenate strings in Java, including the use of the `+` operator to combine strings and to concatenate strings with numbers.

## StringConcatDemo.java

```java
package modifierdemo;

public class StringConcatDemo {

    public static void main(String[] args) {
        // String concatenation using + operator
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2 + "!";
        System.out.println(result);

        // Concatenating Strings and numbers
        int num = 10;
        String concatResult = "The number is " + num;
        System.out.println(concatResult);
    }
}
```
## Explanation

1. **String Concatenation with `+` Operator**:
   - `str1` and `str2` are concatenated with `" "` in between to create `"Hello World!"`.
   - This result is stored in `result` and printed as `"Hello World!"`.

2. **Concatenation of Strings and Numbers**:
   - `concatResult` demonstrates concatenating a string with an integer. The integer `num` is converted to a string automatically when concatenated with `"The number is "`.
   - The output will be `"The number is 10"`.

This example shows how Java’s `+` operator can be used for simple string concatenation, making it easy to combine strings and mix text with numerical values.

## Example Output
When the main method is run, the output will be as follows:
```java
Hello World!
The number is 10
```
![image](https://github.com/user-attachments/assets/83e17d67-17b9-4104-8d64-f2d4d5fa170f)

---
