import java.util.Random;
import java.util.Scanner;

public class Zad02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randomowa = new Random();
        //zadanie 1
        /*
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("suma: "+(a+b+c));
        */
        //zadanie 2
        /*
        int wiek = in.nextInt();
        if (wiek > 7 && wiek <= 14){
            System.out.println("Szkoła podstawowa");
        }
        if (wiek > 14 && wiek <= 19){
            System.out.println("Szkoła średnia");
        }
        if (wiek > 19 && wiek < 26){
            System.out.println("Studia");
        }
        */
        //zadanie 3
        /*
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            int liczba = in.nextInt();
            if (liczba > 5)
                suma = suma+liczba;
        }
        System.out.println("Suma 10 wprowadzonych liczb i wylacznie tych wiekszych od 5: "+suma);

         */
        //zadanie 4         Random randomowa = new Random();
        /*
        int liczba = 0;
        int suma = 0;
        for (int i = 0; i < 10; i++)
            {
                liczba = randomowa.nextInt(20)+10;
                if (liczba%3==0) suma = suma+liczba;
            }
            System.out.println("Suma losowych liczb z zakresu <10;20> podzielnych przez 3: "+suma);
         */
        //zadanie 5
        /*
        int liczba = 0;
        int suma = 0;
        int ileparzystych = 0;
        int srednia = 0;
        for (int i = 0; i < 10; i++)
        {
            liczba = randomowa.nextInt(90)+50;
            if (liczba%2==0) {
                suma = suma + liczba;
                ileparzystych++;
            }
            srednia = suma / ileparzystych;
        }
        System.out.println("Srednia parzystych liczb z zakresu <50;90>: "+srednia);
         */

        //zadanie 6
        double x = 1;
        double y = 5;
       // nalezyDoKola(x, y);
       // zadanie 7
       // nalezyDoPierscienia(x, y);
        nalezyDoTrojkata(x,y);
    }
        public static void nalezyDoKola(double x, double y){
            if( (x*x) + ((y-2)*(y-2)) <= 16)
                System.out.println("podane x y należy do koła opisanego nierównością");
            System.out.println("podane x y nie należy do koła opisanego nierównością");
        }
    public static void nalezyDoPierscienia(double x, double y){
        if( ((x+3)*(x+3)) + ((y-2)*(y-2)) <= 16 && ((x+3)*(x+3)) + ((y-2)*(y-2)) >= 4)
            System.out.println("podane x y należy do piescienia opisanego nierównościami");
        else System.out.println("podane x y nie należy do piescienia opisanego nierównościami");
    }
    public static void nalezyDoTrojkata(double x, double y){
        if(y<=1 && y<=2*x-1 && y<=-x+5)
            System.out.println("podane x y należy do trojkata");
        else System.out.println("podane x y nie należy do trojkata");

    }
}

