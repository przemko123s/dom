package lista0;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //zapisDoPliku();
        //wczytywanieZPliku();
        generujTablice();

    }

    public static void generujTablice(){
        int[][] tablica = new int[5][2];
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = random.nextInt() / 100000000;
                System.out.println(tablica[i][j]);
                int a = tablica[i][j];
                System.out.println(Integer.toBinaryString(a));
            }
        }


    }
    public static void wczytywanieZPliku() throws IOException {
        File plik = new File("macierz.txt");
        BufferedReader plikk = new BufferedReader(new FileReader("macierz.txt"));
        Scanner in = new Scanner(plik);
        int [][] tablica = new int[5][2];
        int max = 0;
        int ii = 0;
        int jj = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = Integer.parseInt(in.nextLine());
                System.out.printf("tab[%d][%d] = %d\t", i, j, tablica[i][j]);
                if(tablica[i][j]>max) {
                    max = tablica[i][j];
                    ii=i;
                    jj=j;
                }
            }
            System.out.println();
        }
        System.out.println("MAX: Tab["+ii+"]["+jj+"] = "+max);
    }
    public static void zapisDoPliku() throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("macierz[i][j].txt");
        int[][] tablica = new int[5][2];
        Random random = new Random();
        zapis.println("Macierz");
        zapis.println("5");
        zapis.println("2");
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = random.nextInt() / 100000000;
                zapis.printf("tab[%d][%d] = %d\t", i, j, tablica[i][j]);
            }
            zapis.println();
        }
        zapis.close();
    }
}
