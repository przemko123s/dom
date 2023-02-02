import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Lekcja5 {
    public static void main(String[] args) {
        String[] strings = {"abc", "cde", "civic"};
        String[] strings1 = new String[3]; // deklaracja rozmiaru tablicy

       /* for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
       }*/

      //  int[] ints = {1,2,3,4,8,-1, 99};
      //  int max = getMax(ints);
      //  System.out.println(max);

       // printVerticallyWspak("alfabet");

        String[] a = {"a", "b"};
        String[] b = {"c", "d"};
        String[] concat = concat(a,b);
        for (int i = 0; i < concat.length; i++) {
       //     System.out.println(concat[i]);

        }

     //   double eur = calculate(5, "EUR");
     //   System.out.println(eur);
       // printNumbersWhile();
      //  int suma = smNumbersWHile();
     //   System.out.println(suma);
      //  sumAllNumbersFromKeyboard();
       // printFibonacciSequence(8);
        // isPalindrome("Ab");
      //  smNumbersWHile();
        printVertically2("wspak");

    }
    //konkatynacja to laczenie dwoch tablic

    //{"ab", "ba"}, {"cc"} -> {"ab", "ba", "cc"}
    public static String[] concat(String[] a, String[] b) {
        String[] result = new String[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];            
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length+i]=b[i];
        }
        return result;
    }




    public static void printNumbersWhile(){
        int y = 0;
        while (y<10){
            y++;
            System.out.println(y);;
        }
    }

    public static int smNumbersWHile(){
        int y = 0;
        int sum = 0;
        while (y<50){
            y++;
           // System.out.println(y);;
            sum = sum + y;
            System.out.println("Suma "+y+" liczb to: "+sum);
        }
        return sum;
    }

    public static void sumAllNumbersFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        String input = null;
        int sum = 0;

        while (!"stop".equals(input)) {
            System.out.println("Enter the number, or type \"stop\": ");
            input = scanner.next();
            if("stop".equals(input)){
                break;
            }
            Integer i = Integer.valueOf(input);
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
    }


    public static void printFibonacciSequence(int n){
        if(n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2){
            System.out.println(1);
        }
        int nMinus2 = 0;
        int nMinus1 = 1;
        for(int i = 2; i < n; i++) {
            //  for(int i = 0; i < n-2; i++) {
            int sum = nMinus1 + nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = sum;
        }
        System.out.println(nMinus1);
    }

    //Print all characters in String s in new line
    //example:
    //abcd ->
    //a
    //b
    //c
    //d
    //Tip1: use length() method to get size of string ("abc".length() will return 3)
    //Tip2: use charAt(int i) method to get N-th char of string ("abc".charAt(0) will return 'a')
    public static void printVertically(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++){
            char charAt = s.charAt(i);
            System.out.println(charAt);
        }
    }
    public static void printVerticallyWspak(String s) {
       // int length = s.length();
        for (int i = s.length() - 1; i >= 0; i--){
            //char charAt = s.charAt(i);
            System.out.println(s.charAt(i));
        }
    }

    public static void printVertically2(String s) { //wspak
        int length = s.length();
        for (int i = 0; i < length; i++){
            char charAt = s.charAt(length - 1 - i);
            System.out.println(charAt);
        }
    }

    //Palindrome is a sequence of characters which reads the same backward as forward
    //Return true if given String is palindrome, return false otherwise.
    //Palindrome examples:
    //civic
    //stats
    //level
    //radar
    //Tip use method .charAt(n) to get n character of String.
    //Example:
    //"abcd".charAt(0) => 'a'
    //"abcd".chartAt(3) => 'd'
    //"abcd".chartAt(4) => Exception will be thrown, because there is no character on index 4 in String "abcd"
    public static boolean isPalindrome(String s) {
        int length = s.length();
        boolean result = false;
        for(int i = 0; i < length/2; i++){
           char char1 = s.charAt(length-1-i); //branie literek od tylu
           char char2 = s.charAt(i); //branie literek
            //if(!Objects.deepEquals(char2, char1)){
            if(char2 == char1){
                return false;
            }
        }
        return result;
    }


    //return maximum integer of array
    //Example: {1,2,3,4} -> 4
    //Example: {-1,8,3,3} -> 8
    //Tip1: to initialize array:   int[] a = {1, 2, 3};
    //Tip2; to get N-th element of array a: int elementOfArray=a[0];
    //Tip3: arrays starts indexing from zero so int[] a = {10,2,18}; a[0] -> 10, a[1] -> 2, a[2] -> 18, a[3] -> Exception will be thrown
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i] > max)
               max = array[i];
        }
        return max;
    }




  //  boolean equals1 = "A".equals(input); // --false
  //  boolean equals2 = input.equals("A") //--NullPointerException
  //  boolean equals3 = Objects.equals("A", input); // --false
    //    Program should convert money in PLN to foreign currencies (USD,GBP,EUR,CHF)
    //    Assume following currency rate:
    //    USD->PLN 4.19
    //    GBP->PLN 5.18
    //    EUR->PLN 4.54
    //    CHF->PLN 4.31
    //    In case of unknown currency program should throw IllegalArgumentException with following message "Error! Following currency: {currency} is not available"
    //    Tip: how to throw an exception: throw new IllegalArgumentException("Error msg");



    public static double calculate(double amountInPLN, String currency) {
       switch (currency){
           case "USD":
               return  amountInPLN * 4.19;
           case "GBP":
               return  amountInPLN * 5.18;
           case "EUR":
               return  amountInPLN * 4.54;
           case "CHF":
               return  amountInPLN * 4.31;
           default:
               throw new IllegalArgumentException("Error! Following currency: " + currency + " is not available");


       }
      /*  public static double calculateNew(double amountInPLN, String currency) {
            return switch (currency) {
                case "USD" -> amountInPLN * 4.19;
                case "GBP" -> amountInPLN * 5.18;
                case "EUR" -> amountInPLN * 4.54;
                case "CHF" -> amountInPLN * 4.31;
                default ->
                        throw new IllegalArgumentException("Error! Following currency: " + currency + " is not available");
            };



    }*/




    }
}