package homework;

import java.util.Scanner;

public class AveArrayProg19 {



        public void smu(){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the required size of the array : ");
            int numSize = sc1.nextInt();
            int myArray[] = new int [numSize];
            int sum = 0;
            int avg = 0;

            System.out.println("Enter the elements of the array one by one ");

            for(int i=0; i<numSize; i++){
                myArray[i] = sc1.nextInt();
                sum = sum + myArray[i];
                avg = sum/numSize;
            }
           sc1.close();
            System.out.println("Avg of the elements of the array :"+ avg);
        }
        public static void main(String args[]){
            AveArrayProg19 obj = new AveArrayProg19();
            obj.smu();
        }
    }




