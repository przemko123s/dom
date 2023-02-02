public class Lekcja3a {
    public static void main(String[] args) {
//        printIfNewHondaFanShouldBuy("HOnda", 2019);
        boolean b1 = shouldNewHondaFanBuy("HOnda", 2015);
        boolean b = shouldNewHondaFanBuy2("HOnda", 2019);
        boolean toyota = shouldBigHondaFanAndNewToyotaFanBuy("Honda", 2001);
//        System.out.println(b1);
//        System.out.println(b);
        //System.out.println(toyota);
//        System.out.println(isEven(1));
//        System.out.println(isEven(2));
//        System.out.println(isEven(3));
//        System.out.println(isEven(4));
//        printDividers(30);
        is21Here(42,21);

        System.out.println(order(1,2,3, false));

    }
    //Print "should buy" if carBrand is "honda" and year of production is higher then 2017,
    // otherwise print "shouldn't buy".
    public static void printIfNewHondaFanShouldBuy(String carBrand, int year) {
        if (carBrand.toLowerCase().equals("honda") && year > 2017)
            System.out.println("should buy");
        else
            System.out.println("shouldn't buy");
    }
    //return true if carBrand is "honda" and year of production is higher then 2017,
    // otherwise return false.
    public static boolean shouldNewHondaFanBuy(String carBrand, int year) {
        if (carBrand.toLowerCase().equals("honda") && year > 2017)
            return true;
        return false;
    }
    public static boolean shouldNewHondaFanBuy2(String carBrand, int year) {
            return (carBrand.toLowerCase().equals("honda") && year > 2017);
    }

    // return true if carBrand is "honda"
    // return true if carBrand is "toyota" and year of production is higher then 2016,
    // otherwise return false
    public static boolean shouldBigHondaFanAndNewToyotaFanBuy(String carBrand, int year) {
        return (carBrand.toLowerCase().equals("honda") || carBrand.toLowerCase().equals("toyota") && year > 2016);
    }

    //return true if given number is even, otherwise return false.
    public static boolean isEven(int i) {
        return i%2==0;
    }

    //if given number is dividable by 3 print "{i} is dividable by 3"
    //if given number is dividable by 4 print "{i} is dividable by 4"
    //if given number is dividable by 5 print "{i} is dividable by 5"
    //if given number is dividable by 9 print "{i} is dividable by 9"
    //otherwise print "{i} is not dividable by 3/4/5/9"
    public static void printDividers(int i) {
        if (i%3==0)
            System.out.println(i+" is dividable by 3");
        if (i%4==0)
            System.out.println(i+" is dividable by 4");
        if (i%5==0)
            System.out.println(i+" is dividable by 5");
        if (i%9==0)
            System.out.println(i+" is dividable by 9");
        if(i%3!=0 &&
                i%4!=0 &&
                i%5!=0 &&
                i%9!=0) System.out.println(i+" is not dividable by 3/4/5/9");
    }

    //return true if any of parameters is equal to 21,
    //or if sum is equal to 21,
    //or if difference is equal to 21,
    //otherwise return false;
    public static boolean is21Here(int a, int b) {
        return (Math.abs(a-b)==21 || Math.abs(a+b)==21 || a==21 || b==21);
    }

    //return true if parameters are in ascending order (a<b<c)
    //if equalAllowed is true parameters can be equal (a<=b<=c)
    //otherwise return false
    public static boolean order2(int a, int b, int c, boolean equalAllowed) {
        if (equalAllowed == true)
            return a <= b && b <= c;
            return a < b && b < c;
    }
    public static boolean order(int a, int b, int c, boolean equalAllowed) {
        return ((a<b && b<c) || (a<=b && b<=c && equalAllowed));
    }

    //Return the sum of two 6-sided dice rolls, each in the range 1..6. However,
    //if noDoubles is true, if the two dice show the same value, i
    //ncrement one die to the next value, wrapping around to 1 if its value was 6.
    //withoutDoubles(2, 3, true) → 5
    //withoutDoubles(3, 3, true) → 7
    //withoutDoubles(3, 3, false) → 6
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return 0;
    }
}