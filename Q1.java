// Q1)Write the following a functional interface and implement it using lambda: 1. To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean 2. Increment the number by 1 and return incremented value Parameter (int) Return int 3. Concatination of 2 string Parameter (String , String ) Return (String) 4. Convert a string to uppercase and return . Parameter (String) Return (String)


@FunctionalInterface
interface TwoIntComparator {
    boolean compare(int a, int b);
}

@FunctionalInterface
interface Incrementor {
    int increment(int a);
}

@FunctionalInterface
interface StringConcatenator {
    String concat(String a, String b);
}

@FunctionalInterface
interface ToUpperCaseConverter {
    String convert(String input);
}

public class LambdaExamples {
    public static void main(String[] args) {
        TwoIntComparator greater = (a, b) -> a > b;
        Incrementor inc = a -> a + 1;
        StringConcatenator concat = (a, b) -> a + b;
        ToUpperCaseConverter upper = s -> s.toUpperCase();

        System.out.println(greater.compare(10, 5)); // true
        System.out.println(inc.increment(7));       // 8
        System.out.println(concat.concat("Java", "8")); // Java8
        System.out.println(upper.convert("java"));  // JAVA
    }
}
