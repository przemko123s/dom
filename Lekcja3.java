public class Lekcja3 {

    public static void main(String[] args) {
        String name = "Olek";
      /*
        if (name.equals("Olek")) {
            System.out.println("tak, to Olek");
        } else {
            System.out.println("nie, to nie Olek");
        }
        */

        // printIfNewHondaShouldBuy("fiat", 2019);
        // printIfNewHondaShouldBuy("honda", 2018);
        // printIfNewHondaShouldBuy("Honda", 2018);
        // printIfNewHondaShouldBuyTooLowerCase("HoNdA", 2018);
//        printIfNewHondaShouldBuyTrueOrFalse("Honda", 2018);
//        printIfNewHondaShouldBuyTrueOrFalse("honda", 2018);
//        printIfNewHondaShouldBuyTrueOrFalse("HoNdA", 2018);
//        boolean b = printIfNewHondaShouldBuyTrueOrFalse("fiat", 2019);
//        System.out.println(b);
//        b = printIfNewHondaShouldBuyTrueOrFalse("HONda", 2019);
//        System.out.println(b);
//
//        boolean a = shouldNewHondaFanBuy("HONDA", 2020);
//        System.out.println(a);
//        a = shouldNewHondaFanBuy("HONDA", 2000);
//        System.out.println(a);
//        boolean t = shouldNewHondaFanBuyOrToyota("toYOta", 2020);
//        System.out.println(t);
//        t = shouldNewHondaFanBuyOrToyota("toyota", 2015);
//        System.out.println(t);
//        System.out.println(shouldNewHondaFanBuyOrToyota("toyota", 2015));
//        System.out.println(isEven(1));
//        System.out.println(isEven(2));
//        System.out.println(isEven(3));
//        System.out.println(isEven(0));
        //    System.out.println(isEven3459(180));
        //   System.out.println(isEven3459(360));
        //   System.out.println(isEven3459(45));
        //   System.out.println(isEven3459(85));
        //   System.out.println(is21(-21, 42));
        // System.out.println(is21(42, -21));
   //     boolean order = order(1,2,3,false);
        //   System.out.println(order);
     //   System.out.println(order(2, 2, 3, true));
        System.out.println(orderComplete(1,1,0, true));
    }

    public static void printIfNewHondaShouldBuyTooLowerCase(String carBrand, int year) {
        if (carBrand.toLowerCase().equals("honda") && year > 2017) {
            System.out.println("should buy");
        } else {
            System.out.println("Shoudn't buy");
        }
    }

    public static void printIfNewHondaShouldBuy(String carBrand, int year) {
        if (carBrand.equals("honda") && year > 2017) {
            System.out.println("should buy");
        } else {
            System.out.println("Shoudn't buy");
        }
    }

    public static boolean printIfNewHondaShouldBuyTrueOrFalse(String carBrand, int year) {
        if (carBrand.toLowerCase().equals("honda") && year > 2017) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean shouldNewHondaFanBuy(String carBrand, int year) {
        return carBrand.toLowerCase().equals("honda") && year > 2017;
    }

    public static boolean shouldNewHondaFanBuyOrToyota(String carBrand, int year) {
        return carBrand.toLowerCase().equals("honda") && year > 2017 || carBrand.toLowerCase().equals("toyota") && year > 2016;

    }

    public static boolean isEven(int i) {
        if (i % 2 == 0)
            return true;
        else return false;
    }

    public static boolean isEven3459(int i) {
        if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 9 == 0)
            return true;
        else return false;
    }

    public static boolean is21(int a, int b) {
        return (a == 21 || b == 21 || Math.abs(a + b) == 21 || Math.abs(a - b) == 21);
    } // mamy zwrócić TRUE jeśli::

    //opisane z Math.abs jest tak aby komputer sam szukal rozwiazania czyli dzialania dajacego wynik
    //21 np[ liczby 18 i 3, 3 i 18, 20 i 1, 42 i -21 itd
    public static boolean order(int a, int b, int c, boolean equalAllowed) {
        if (a < b && b < c) {
            //equalAllowed = true;
            //return equalAllowed;
            return true;
        }

        if (a <= b && b <= c && equalAllowed) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean orderComplete(int a, int b, int c, boolean equalAllowed) {
        return ((a < b && b < c) || (a <= b && b <= c && equalAllowed));
    }
}

