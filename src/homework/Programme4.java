package homework;

public class Programme4 {

            public static void main(String[] args) {
            Programme4 obj = new Programme4();
            obj.isLeapYear(1600);
            getDaysInMonth(-1,2020);
        }
        public static void isLeapYear(int year) {
            if (year < 1 && year > 9999) {
                System.out.println("false");
            } else if ((year >= 1 && year <= 9999) && (year % 400 == 0)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        public  static void getDaysInMonth(int month, int year){
            if((month<1 || month>12)  ||  (year<1 || year>9999)){
                System.out.println("-1");
            }else{
                switch (month) {
                    case 2:
                        if ((year >= 1 && year <= 9999) && (year % 400 == 0)) {
                            System.out.println("28");
                        }
                        else {
                            System.out.println("29");
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30");
                        break;
                    default:
                        System.out.println("31");
                }
            }

        }

    }

