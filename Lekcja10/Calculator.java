package Lekcja10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {


    public void divideFromCommandLine() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = scanner.nextInt();
        System.out.println("Enter B: ");
        int b = scanner.nextInt();
        System.out.println("Result: ");
        System.out.println(divide(a, b));

}

    public int divide(int a, int b) {
            return a / b;
    }


//    public int divide(int a, int b){
//        try{
//            return a/b;
//        } catch(ArithmeticException e){
//            System.out.println("Nie dziel przez 0");
//            System.out.println(e);
//            e.printStackTrace(); //zachowanie tak jak bez obslugi
//            throw e;
//        }
//    }

}
