package javaStart.samouczekprogramisty;

public class Main {
    public static void main(String[] args) {
        MyNumber a = new MyNumber(3);


    }
     //  Napisz metodę, która jako argument przyjmie trzy liczby. Metoda
    //   powinna zwrócić true jeśli z odcinków o długości przekazanych
    //   w argumentach można zbudować trójkąt prostokątny.

    private static boolean canConstructRightAngledTriangle(double number1, double number2, double number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            return false;
        }
        // double[] sides = new double[] {number1, number2, number3};
        // Arrays.sort(sides);
        // return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];

        double longest = number1;
        double side1 = number2;
        double side2 = number3;

        if (number2 > number1 && number2 > number3) {
            longest = number2;
            side1 = number1;
            side2 = number3;
        }
        else if (number3 > number1 && number3 > number2) {
            longest = number3;
            side1 = number1;
            side2 = number2;
        }

        return side1 * side1 + side2 * side2 == longest * longest;
    }


}
