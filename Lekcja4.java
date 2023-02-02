import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lekcja4 {
    public static void main(String[] args) {
        //    printNr(1);
        //   String s = returnNumber(1);
        //   System.out.println(s);
        //  System.out.println(returnNumber(1));
        // System.out.println(returnNumber3(111));
        //  System.out.println(seasonNr(3));
        //  monthSeason("May");
        // monthSeason("June");
        //twoSeasons(4);

        // returnGrade(1);
        //  System.out.println(returnGrade3(3));

        //gdy nasza funckja ze switchem zwraca nam stringa
        //to piszemy sout aby nam wypisalo tego stringa

        //   StartQuiz();

        //print2NumbersEasy();
       // System.out.println(sumNumbers());
        //gdy funkcja cos zwraca to souta dajemy a gdy jest void to sama nazwa funkcji

        sum5NumbersFromKeyboard();
    }


    //5 intow z wejscia w petli i ich suma

    public static void sum5NumbersFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            int input = scanner.nextInt();
            sum = sum + input;
        }
        System.out.println("Sum: " + sum);
    }

    //return dum of numbers 1 to 50
    public static int sumNumbers() {
        int suma = 0;
        for (int i = 0; i <= 50; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }

    public static void print2Numbers() {
        for (int i = 2; i <= 10; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }

    public static void print2NumbersEasy() {
        for (int i = 2; i <= 10; i = i + 2)
            System.out.println(i);
    }

    public static void printNr(int nr) {
        switch (nr) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Unknown Number");

        }
    }

    public static String returnNumber(int nr) {
        String s = switch (nr) {
            case 1 -> {
                System.out.println("Returning One");
                yield "One";
            }
            case 2 -> "two";
            case 3 -> "three";
            default -> "Unknown Number";
        };
        return s;
    }

    public static String returnNumber2(int nr) {
        switch (nr) {
            case 1:
                return "One";
            case 2:
                return "twi";
            case 3:
                return "three";
            default:
                return "Unknown Number";

        }
    }

    public static String returnNumber3(int nr) {
        return switch (nr) {
            case 1, 11, 111 -> "One or one one or one one one :)";
            case 2 -> "twi";
            case 3 -> "three";
            default -> "Unknown Number";
        };
    }

    public static String seasonNr(int NrMonth) {
        return switch (NrMonth) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Sunrise";
            case 9, 10, 11 -> "Autumn";
            default -> "incorrect Month!";
        };
    }

    /*
        public static void seasonMonth(String NameMonth) {
            return switch (NameMonth) {
                case "January" -> "Winter";
                case "February" -> "Winter";
                case "March" -> "Spring";
                case "April" -> "Spring";
                case "May" -> "Spring";
                case "June" -> "Sunrise";
                case "July" -> "Sunrise";
                case "August" -> "Sunrise";
                case "September" -> "Autumn";
                case "November" -> "Autumn";
                case "December" -> "Winter";
                default -> "bad name of Month!";
            };
        }
    */
    public static void monthSeason(String Month) {
        String lowerCaseMonth = Month.toLowerCase();
        switch (lowerCaseMonth) {
            case "march", "april", "may" -> System.out.println("Spring");
            case "june", "july", "august" -> System.out.println("Sunrise");
            case "december", "january", "february" -> System.out.println("Winter");
            case "september", "october", "november" -> System.out.println("Autumn");

            default -> System.out.println("nietrafiona wiosna/lato!");
        }
    }

    public static void twoSeasons(int Month) {
        switch (Month) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 6, 7, 8:
                System.out.println("Sunrise!");
                break;
            default:
                System.out.println("Nie ma zimy, nie ma lata!");
        }
    }


    public static String returnGrade(int grade) {
        switch (grade) {
            case 1:
                return "bad";
            case 2:
                return "not good";
            case 3:
                return "ok";
            case 4:
                return "good";
            case 5:
                return "excellent";
            default:
                return null;
        }
    }

    public static String returnGrade2(int grade) {
        String result = null;
        switch (grade) {
            case 1 -> result = "bad";
        }
        return result;
    }

    public static String returnGrade3(int grade) {
        return switch (grade) {
            case 1 -> "bad";
            default -> "default";
        };
    }

    public static String returnGrade4(int grade) {
        String switchResult = switch (grade) {
            case 1 -> "bad";
            default -> "default";
        };
        return switchResult;

    }


    public static void StartQuiz() {
        int score = 2;
        Scanner scanner = new Scanner(System.in);
        //question 1
        System.out.println("Which types represents integral numbers?");
        System.out.println("a. int, float, short, long");
        System.out.println("b. int, short, byte, double");
        System.out.println("c. int, byte, short, long");
        System.out.println("d. float, long, short, byte");
        System.out.println();
        System.out.println("Enter your choice: ");
        String answer1 = scanner.next();
        switch (answer1) {
            case "c" -> {
                score++;
                System.out.println("correct");
            }
            case "a", "b", "d" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }

        System.out.println("Assuming x is int variable, hot to correctly write 'if' statement?");
        System.out.println("Number 15 in binary system is: ");
        System.out.println("a. 1010");
        System.out.println("b. 1111");
        System.out.println("c. 1001");
        System.out.println("d. 10000");
        System.out.println();
        System.out.println("Enter your choice:  ");
        String answer2 = scanner.next();

        switch (answer2) {
            case "c" -> {
                score++;
                System.out.println("correct");
            }
            case "a", "b", "d" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }


        System.out.println("String is not: ");
        System.out.println("a. an object");
        System.out.println("b. representing text type");
        System.out.println("c. a primitive type");
        System.out.println("d. all answers are correct");
        System.out.println();
        System.out.println("Enter your choice: ");
        String answer3 = scanner.next();

        switch (answer3) {
            case "d" -> {
                score++;
                System.out.println("correct");
            }
            case "a", "b", "c" -> System.out.println("Incorrect");
            default -> System.out.println("Answer not available!");
        }

        System.out.println("Your grade isssss: " + returnGrade(score) + ".`");
    }


}


