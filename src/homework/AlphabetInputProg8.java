package homework;

public class AlphabetInputProg8 {


    public void c() {
        char alphabet = 'D';
        String cityName;

        if (alphabet == 'A') {
            cityName = "Ahmedabad";
        } else if (alphabet == 'B') {
            cityName = "Bombay";
        } else if (alphabet == 'C') {
            cityName = "Calcutta";
        } else if (alphabet == 'D') {
            cityName = "Delhi";
        } else if (alphabet == 'E') {
            cityName = "Edmonton";
        } else if (alphabet == 'F') {
            cityName = "Frankfurt";
        } else {
            cityName = "Invalid entry!";
        }

        System.out.println("City Name: " + cityName);
    }

    public static void main(String[] args) {
        AlphabetInputProg8 obj = new AlphabetInputProg8();
        obj.c();
    }
}








