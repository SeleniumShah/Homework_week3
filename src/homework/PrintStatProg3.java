package homework;

import java.util.Scanner;

public class PrintStatProg3 {

    public void ms(){
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String n = sn.next();
        System.out.println("Enter Roll No: ");
        int r = sn.nextInt();
        System.out.println("Math : ");
        int m = sn.nextInt();
        if (m>100){
            System.out.println("Invalid Input");
        }else
            System.out.println("Science : ");
        int s = sn.nextInt();
        if (s>100) {
            System.out.println("Invalid Input");
        }else
            System.out.println("English : ");
        int e = sn.nextInt();
        if (e>100) {
            System.out.println("Invalid Input");
        }
        int t = m+s+e;
        int p= t/3;
        if (p >= 80) {
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    A+            |");
            System.out.println("|---------------------------------|");
        } else if (p<80 && p>=60) {
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    A             |");
            System.out.println("|---------------------------------|");

        } else if(p<60 && p>=50){
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    B             |");
            System.out.println("|---------------------------------|");
        } else if (p<50 && p>=35) {
            System.out.println("|---------------------------------|");
            System.out.println("|           Mark Sheet            |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Name : " +n+ "         |");
            System.out.println("|          Roll No: "+r+ "        |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|          Science: " +s+ "       |");
            System.out.println("|          Math: " +m+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|          Total: "+t+ "          |");
            System.out.println("|---------------------------------|");
            System.out.println("|         Percentage:" +p+ "      |");
            System.out.println("|         Result :  Pass          |");
            System.out.println("|         Grade:    C             |");
            System.out.println("|---------------------------------|");
        }

    }

    public static void main(String[] args) {
        PrintStatProg3 obj =new PrintStatProg3();
        obj.ms();
    }
}



