package książka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ile liczb wylosowac: ");
        int ileLiczb = in.nextInt();
        System.out.println("Jaka jest najwieksza liczba?");
        int najwiekszaLiczba = in.nextInt();
        int[] numbers = new int[najwiekszaLiczba];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int[] result = new int[ileLiczb];
        for (int i = 0; i < result.length; i++) {
            int wylosowanaLiczba = (int) (Math.random() * najwiekszaLiczba);
            result[i] = numbers[wylosowanaLiczba];
            numbers[wylosowanaLiczba] = numbers[najwiekszaLiczba - 1];
            najwiekszaLiczba--;
        }
        Arrays.sort(result);
        System.out.println("Postaw na: ");
        for (int r : result) {
            System.out.println(r);
        }
    }
}
