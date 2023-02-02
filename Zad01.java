import java.util.Scanner;

public class Zad01 {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println("Witamy na pierwszych zajęciach z programowania w Javie");
        String mojeImie = "Przemysław";
        String mojeNazwisko = "Frydrych";
        System.out.println("Nazywam się " + mojeImie + " " + mojeNazwisko);

        //zadanie 2
        /*
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("*     " + mojeImie + " " + mojeNazwisko + "    *");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("******************************");
        */
        //zadanie 3
        SOP("To robi metoda SOP");
        //zadanie 4
        Scanner in = new Scanner(System.in);/*
        mojeImie = in.next();
        mojeNazwisko = in.next();
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("*     " + mojeImie + " " + mojeNazwisko + "    *");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("******************************");
        */
        //zadanie 5
        //int liczba1 = in.nextInt();
        //int liczba2 = in.nextInt();
        /*
        System.out.println("a+b="+(liczba1+liczba2));
        System.out.println("a-b="+(liczba1-liczba2));
        System.out.println("a*b="+(liczba1*liczba2));
        System.out.println("a/b="+(liczba1/liczba2));
        */
        //zadanie 6
        //System.out.println("a/b="+(liczba1/liczba2)+" ile razy liczba2 miesci sie w liczba1");
        //System.out.println("a%b="+(liczba1%liczba2)+" reszta z dzielenia tzw MODULO");
        //zadanie 7
        //int r = in.nextInt();
        //System.out.println("Pole koła o promieniu: "+r+" wyniesie: "+poleKola(r));
        //zadanie 8
        //int a = 5;
        //int b = 10;
        //rozwiazProstokat(a,b);
        //zadanie 9
        int r = 5;
        int h = 10;
        rozwiazStozek(r,h);
    }
    public static void SOP(String s) {
    System.out.println(s);
    }
    public static double poleKola(double r) {
        return Math.PI * r * r;
    }
    public static void rozwiazProstokat(double a, double b){
        System.out.println("Obwód: "+(a+a+b+b));
        System.out.println("Pole: "+(a*b));
        System.out.println("Przekątna: "+Math.sqrt(a*a+b*b));
    }
    public static void rozwiazStozek(double r, double h){
        System.out.println("Pole podstawy: "+Math.PI*r*r);
        System.out.println("Pole całkowite: "+(Math.PI*r*r)+(Math.PI*r*(Math.sqrt((r/2)*(r/2)+(h*h)))));
        System.out.println("Objętość stożka: "+((Math.PI*r*r)/3*h));
    }
}

