package Lekcja10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final Calculator calculator = new Calculator();
//        try {
//            calculator.divideFromCommandLine();
//        } catch (InputMismatchException e) {
//            System.out.println("Nie wprowadzono liczby!");
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            System.out.println("Nie dziel przez zero!");
//            e.printStackTrace();
//            throw e;
//        } finally{
//            System.out.println("Miłego dnia!");
//        }
//        final FileManager fileManager = new FileManager();
//        final String filename = "xd.txt";
//
//        try {
//            fileManager.createFile(filename);
//        } catch (FileCreationException e) {
//            System.err.println("File creation exception");
//            e.printStackTrace();
//        }
//        fileManager.writeToFile(filename, "wtf");
//        final String s = fileManager.readFile(filename);
//        System.out.println(s);
            try{
                throw new NullPointerException();
            } finally{
                System.out.println("test");
            }
    }
}
