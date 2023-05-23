package homework;

public class OddOrEvenProg6 {


        public static void main(String[] args) {
            int number = 21; // Enter number

            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        public static boolean isEven(int number) {
            return number % 2 == 0;
        }
    }




