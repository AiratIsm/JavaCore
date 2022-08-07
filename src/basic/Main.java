package basic;

public class Main {
    public static void main(String[] args) {
       int a=10;
       int b=25;
       int c = num(a, b);
        System.out.println(c);
    }

    public static int num (int firstNumber, int secondNumber) {
       return firstNumber * secondNumber;
}
}