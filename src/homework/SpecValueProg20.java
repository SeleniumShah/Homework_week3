package homework;

import java.util.Scanner;

public class SpecValueProg20 {

    public void b() {

        Scanner input = new Scanner(System.in);
        int i, x;
        System.out.print("Input the size of the array: ");
        int size = input.nextInt();
        int num[] = new int[size];  /* declaration */

        //  System.out.println("Enter "+ size + " values: \n");
        for (i = 0; i < num.length; i++) {
            System.out.println("Enter Number to add at index " + i + " : ");
            x = input.nextInt();
            num[i] = x;
        }
        System.out.print("Enter the search value: ");
        int search = input.nextInt();
        boolean condition = false;
        for (i = 0; i < num.length; i++) {
            if (num[i] == search) {
                condition = true;
                break;
            }
        }
        if (condition == true) {
            System.out.println("Number is Array!");
        } else {
            System.out.println("Number is not in array");
        }
    }
        public static void main (String[]args){
            SpecValueProg20 obj = new SpecValueProg20();
                    obj.b();
        }
    }




