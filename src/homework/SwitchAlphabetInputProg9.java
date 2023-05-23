package homework;

import java.util.Scanner;

public class SwitchAlphabetInputProg9 {

    public void s() {
        Scanner alphabet = new Scanner(System.in);
        System.out.println("Enter an alphabet A to F: ");

        String a1 = alphabet.next();
        city(a1);
    }

    public static void city(String a1) {
        switch (a1) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Calcutta");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Edmonton");
                break;
            case "F":
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {
        SwitchAlphabetInputProg9 obj = new SwitchAlphabetInputProg9();
        obj.s();
    }

}





