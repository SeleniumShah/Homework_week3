package homework;

import java.util.Scanner;

public class SalesDataProg7 {


        public void m1(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Sales ID: ");
            int salesId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Seller's Name: ");
            String sellerName = sc.nextLine();

            System.out.print("Enter Sales Amount: ");
            double salesAmount = sc.nextDouble();

            System.out.print("Enter Salary Basic: ");
            double salaryBasic = sc.nextDouble();

            double commission = calculateSalesCommission(salesAmount);

            System.out.println("Sales Commission: " + commission);

            sc.close();
        }

        public static double calculateSalesCommission(double salesAmount) {
            if (salesAmount >= 50000) {
                return 0.35 * salesAmount;
            } else if (salesAmount >= 30000) {
                return 0.20 * salesAmount;
            } else if (salesAmount >= 20000) {
                return 0.10 * salesAmount;
            } else if (salesAmount >= 10000) {
                return 0.05 * salesAmount;
            } else {
                return 0.02 * salesAmount;
            }
        }

    public static void main(String[] args) {
        SalesDataProg7 obj = new SalesDataProg7();
        obj.m1();
    }
    }


