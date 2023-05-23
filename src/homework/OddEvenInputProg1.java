package homework;

import java.util.Scanner;

public class OddEvenInputProg1 {

    /**
     * 1.	Write a java program that tells us that Input number is odd or even?     HINT: use ternary operator (? :)
     */
    public void oddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int x = sc.nextInt();
        System.out.println(!(x % 2 == 0) ? "Odd Number" : "Even Number");
    }

    public static void main(String[] args) {
        OddEvenInputProg1 obj = new OddEvenInputProg1();
        obj.oddEven();
    }

}











