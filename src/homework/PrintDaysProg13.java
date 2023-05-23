package homework;

import java.util.Scanner;

public class PrintDaysProg13 {

    /**
     * Write a Java program which input any number between 1 to 7 and it print The Days
     * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
     * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
     */

        public void wd(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number :");
            int wds = sc.nextInt();
            sc.close();
            switch (wds){
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("TUESDAY");
                    break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");
                    break;
                default:
                    System.out.println("Week contains 1 to 7 days");
            }
        }
        public static void main(String[] args) {
            PrintDaysProg13 obj = new PrintDaysProg13();
            obj.wd();
        }
    }





