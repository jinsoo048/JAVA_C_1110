package jjs.operator;

public class Assignment {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("num2 = num1 " + (num2 = num1));
        System.out.println("num2 += num1 " + (num2 += num1));
        System.out.println("num2 -= num1 " + (num2 -= num1));
        System.out.println("num2 *= num1 " + (num2 *= num1));
        System.out.println("num2 /= num1 " + (num2 /= num1));
    }
}
