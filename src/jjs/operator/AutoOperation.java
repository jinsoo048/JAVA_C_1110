package jjs.operator;

public class AutoOperation {
    public static void main(String args[]) {
        int num1 = 100;
        int num2 = 200;

        //num1++;
        //num2--;
        int sum1 = num1++ + num2++;

        //++num1;
        //++num2;
        int sum2 = ++num1 + ++num2;

        System.out.println("sum1 is: " + sum1);
        System.out.println("sum2 is: " + sum2);
    }
}


