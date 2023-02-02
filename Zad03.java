import java.util.Scanner;

public class Zad03 {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        //int suma = 0;
        Scanner in = new Scanner(System.in);
        /*
        a = in.nextInt();
        n = in.nextInt();
        for (int i = 0; i < n ; i++) {
            suma = suma*a;
        }
        System.out.println("Suma: "+suma);
        */
        //zadanie 3
        /*
        int silnia = 1;
        n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            silnia = silnia * i;
        }

         */
        //zadanie 4
        /*
        suma = 0;
        for (int i = 100; i <= 999 ; i++) {
            if (i%5==0 && !(i%3==0))
            suma = suma+i;
        }
        System.out.println("Suma: "+suma);

         */
        //zadanie 5
        /*
        int liczbaJednostek = 0;
        int liczbaDziesietna = 0;
        int liczbaSetek = 0;
        int liczbaTysiecy = 0;
        int liczba = 0;
        int sumaCyfr = 0;
        int suma = 0;
        for (int i = 1000; i <= 9999; i++) {
            liczba = i;
            liczbaJednostek = liczba%1000;
            liczba=liczba/10;
            liczbaDziesietna = liczba%100;
            liczba=liczba/10;
            liczbaSetek = liczba%10;
            liczba=liczba/10;
            liczbaTysiecy = liczba%1;
            sumaCyfr = liczbaJednostek + liczbaDziesietna + liczbaSetek + liczbaTysiecy;
            if (sumaCyfr == 5){
                suma = suma + i;
            }
        }
        System.out.println("Suma liczb czterocyfrowych ktorych suma cyfr to 5 to: "+suma);
         */
        //zadanie 6
        int liczbaJednostek = 0;
        int liczbaDziesietna = 0;
        int liczbaSetek = 0;
        int liczbaTysiecy = 0;
        int liczbaDTysiecy = 0;
        int liczba = 0;
        int sumaCyfrParzystych = 0;
        int sumaCyfrNieParzystych = 0;
        int suma = 0;
        for (int i = 10000; i <= 99999; i++) {
            liczba = i;
            liczbaJednostek = liczba%10000;
            if(liczbaJednostek % 2 == 0)
                sumaCyfrParzystych = sumaCyfrParzystych + liczbaJednostek;
                        else
                sumaCyfrNieParzystych = sumaCyfrNieParzystych + liczbaJednostek;
            liczba=liczba/10;
            liczbaDziesietna = liczba%1000;
            if(liczbaDziesietna % 2 == 0)
                sumaCyfrParzystych = sumaCyfrParzystych + liczbaDziesietna;
            else
                sumaCyfrNieParzystych = sumaCyfrNieParzystych + liczbaDziesietna;
            liczba=liczba/10;
            liczbaSetek = liczba%100;
            if(liczbaSetek% 2 == 0)
                sumaCyfrParzystych = sumaCyfrParzystych + liczbaSetek;
            else
                sumaCyfrNieParzystych = sumaCyfrNieParzystych + liczbaSetek;
            liczba=liczba/10;
            liczbaTysiecy = liczba%10;
            if(liczbaTysiecy% 2 == 0)
                sumaCyfrParzystych = sumaCyfrParzystych + liczbaTysiecy;
            else
                sumaCyfrNieParzystych = sumaCyfrNieParzystych + liczbaTysiecy;
            liczba=liczba/10;
            liczbaDTysiecy = liczba%1;
            if(liczbaDTysiecy% 2 == 0)
                sumaCyfrParzystych = sumaCyfrParzystych + liczbaDTysiecy;
            else
                sumaCyfrNieParzystych = sumaCyfrNieParzystych + liczbaDTysiecy;

        }
        System.out.println("sumaCyfrParzystych: "+sumaCyfrParzystych);
        System.out.println("sumaCyfrNieParzystych: "+sumaCyfrNieParzystych);

    }
}
