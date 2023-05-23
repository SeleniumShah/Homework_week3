package homework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class TwoNumSymbolProg10 {
    public static void main(String[] args) {
        TwoNumSymbolProg10 obj = new TwoNumSymbolProg10();
        obj.t();
    }

    public Void t() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the symbol (+, -, /, *): ");
        String symbol = sc.next();

        // int ans = calculation(num1, num2, symbol);
        if (symbol.equals("+")) {
            int ans = num1 + num2;
            System.out.println(ans);
        } else if (symbol.equals("-")) {
            int ans = num1 - num2;
            System.out.println(ans);
        } else if (symbol.equals("*")) {
            int ans = num1 * num2;
            System.out.println(ans);
        } else if (symbol.equals("/")) {
            int ans = num1 / num2;
            System.out.println(ans);

        }

        return null;
    }
}









