package homework;

import java.util.Scanner;

public class SalarySlipProg5 {


        public void m(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Employee ID: ");
            int employeeId = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = sc.nextDouble();

            double hra = calculateHRA(basicSalary);
            double ta = calculateTA(basicSalary);
            double da = calculateDA(basicSalary);
            double pf = calculatePF(basicSalary);
            double grossSalary = calculateGrossSalary(basicSalary, hra, ta, da, pf);

            System.out.println("_______________________________");
            System.out.println("\t\t Salary Slip");
            System.out.println("|______________________________|");
            System.out.println("\tEmployee Id   : " + employeeId);
            System.out.println("\tEmployee Name : " + employeeName);
            System.out.println("|______________________________|");
            System.out.println("| Basic Salary  : " + basicSalary);
            System.out.println("| HRA  10%      : " + hra);
            System.out.println("| TA   8%       : " + ta);
            System.out.println("| DA   9%       : " + da);
            System.out.println("| PF - 20%      : " + pf);
            System.out.println("|______________________________|");
            System.out.println("\tGross Salary  : " + grossSalary);
            System.out.println("|===========================|");

            sc.close();
        }

        public static double calculateHRA(double basicSalary) {
            return basicSalary * 0.1;
        }

        public static double calculateTA(double basicSalary) {
            return basicSalary * 0.09;
        }

        public static double calculateDA(double basicSalary) {
            return basicSalary * 0.08;
        }

        public static double calculatePF(double basicSalary) {
            return basicSalary * 0.2;
        }

        public static double calculateGrossSalary(double basicSalary, double hra, double ta, double da, double pf) {
            return basicSalary + hra + ta + da - pf;
        }

    public static void main(String[] args) {
        SalarySlipProg5 obj = new SalarySlipProg5();
        obj.m();
    }
    }







