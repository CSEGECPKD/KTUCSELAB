/*
Create an interface calculations with abstract methods to:
i) find the no.of a character in a string.
ii) find reverse of a string.
iii) find the factorial of a number.
Create a class 'StringManipulation' for only first method.And other 2 methods are defined in another class 'Operations'.Write a java prg to describe this situation.
*/

interface Calculations {
    int countCharacter(String str, char ch);
    String reverseString(String str);
    int factorial(int num);
}

class StringManipulation implements Calculations {
    @Override
    public int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

class Operations implements Calculations {
    @Override
    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        Operations operations = new Operations();

        String str = "Hello, World!";
        char ch = 'o';
        int count = stringManipulation.countCharacter(str, ch);
        System.out.println("Number of '" + ch + "' in the string: " + count);

        String reversedStr = operations.reverseString(str);
        System.out.println("Reversed string: " + reversedStr);

        int num = 5;
        int factorial = operations.factorial(num);
        System.out.println("Factorial of " + num + ": " + factorial);
    }
}