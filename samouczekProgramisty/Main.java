package samouczekProgramisty;

public class Main {
    public static void main(String[] args) {
        //odZeraDoX_for(3);
        //odZeraDoX_while(3);
        //wspakLiczba(54321);
        //wspakTekst("Kotek");
        //binarna(22);
        //System.out.println(isPalindrome("oko"));
        //System.out.println(isPalindrome(121));
        //System.out.println(tekstWspak("Akacja"));
        int[] tablica = new int[]{6,5,4,3,2,1};
        //tablica(tablica);
        //sortowanieBabelkowe(tablica);
        System.out.println("nawias ()");

    }


    //Utwórz metodę pobierającą dodatnią liczbę całkowitą X,
    // która wyświetli na ekranie liczby od zera do X,
    public static void odZeraDoX_for(int x) {
        if (x < 0) x = x * (-1);
        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }
    }

    public static void odZeraDoX_while(int x) {
        if (x < 0) x = x * (-1);
        int i = 0;
        while (i < x) {
            System.out.println(i);
            i++;
        }
    }

    //Utwórz metodę, która pobierze liczbę i wypisze każdy znak
    // w osobnej linii zaczynając od ostatniej cyfry (np. dla
    // liczby 123 będą to trzy linie z 3, 2 i 1),
    public static void wspakLiczba(int liczba) {
        String tekst = Integer.toString(liczba);
        System.out.println(tekst);
        System.out.println();
        for (int i = tekst.length() - 1; i >= 0; i--) {
            System.out.println(tekst.charAt(i));
        }
    }

    //Utwórz metodę, która jako argument pobierze obiekt klasy
    // String i zwróci “odwrócony” argument. Na przykład “pies”
    // przekształci w “seip”,
    public static void wspakTekst(String tekst) {
        System.out.println(tekst);
        System.out.println();
        for (int i = tekst.length() - 1; i >= 0; i--) {
            System.out.print(tekst.charAt(i));
        }
    }

    //Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie
    // binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.)
    public static void binarna(int liczba) {
        String a = Integer.toBinaryString(liczba);
        System.out.println(liczba + " to binarnie: " + a);
    }

    //Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi
    // czy jest on palindromem. Np. “kajak” jest palindromem
    // (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie.
    public static boolean isPalindrome(String tekst) {
        for (int i = 0; i < tekst.length() / 2; i++) {
            if (tekst.charAt(i) != tekst.charAt(tekst.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(int liczba) {
        return isPalindrome(Integer.toString(liczba));
    }

    //Utwórz metodę, która jako argument pobierze obiekt klasy String
    // i zwróci “odwrócony” argument. Na przykład “pies” przekształci
    // w “seip”,
    public static String tekstWspak(String tekst) {
        String wspak = "";
        for (int i = 0; i < tekst.length(); i++) {
            wspak = wspak + tekst.charAt(tekst.length() - 1 - i);
        }
        return wspak;
    }

    //Napisz metodę, która pobierze tablicę liczb całkowitych i
    // wyświetli ją w postaci “[liczba, liczba, liczba]”,
    public static void tablica(int[] tab) {
        System.out.print("[ ");
        for (int i = 0; i < tab.length; i++) {
            if (i != tab.length - 1) {
                System.out.print(tab[i] + ", ");
            } else System.out.print(tab[i] + " ");

        }
        System.out.println("]");

    }

    public static void sortowanieBabelkowe(int[] tablica) {
        for (int i = 1; i <= tablica.length; i++) {
            for (int j = 0; j < tablica.length - i; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }
        for (int x : tablica) {
            System.out.println(x);
        }
    }
}

