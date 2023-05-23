package homework;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or "ZERO"
   */

public class PositiveNegativeProg16 {

    public void pnz(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = sc.nextInt();
        if (x >0) {
            System.out.println("Number is Positive");
        }else if (x<0){
            System.out.println("Number is Negative");
        }else {
            System.out.println("Number is 0");
        }

        }

    public static void main(String[] args) {
        PositiveNegativeProg16 obj = new PositiveNegativeProg16();
        obj.pnz();

    }

    }




