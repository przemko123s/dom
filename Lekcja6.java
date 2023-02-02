public class Lekcja6 {
    public static void main(String[] args) {

        //String[] strings = {"a", "b"};

        //int[] ints = {1,7,3,3,5};
        int[] ints = {3,1,8,7};
        int firstEven = findFirstEven(ints);

        double v = calculateAverage(ints);
        System.out.println(v);
      //  System.out.println(firstEven);
        // ==  System.out.println(findFirstEven(ints));

        // printAll(strings);

        boolean[] booleans = areEven(ints);
        for (Boolean b : booleans){
            System.out.println(b);
        }
        System.out.println("Map to string:: ");
        String[] strings = mapToString(ints);
        for (String b : strings){
            System.out.println(b);
        }
    }

    public static void printAll(String[] strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    //Find first even number in given array int[] ints. Return 0 if there is no even numbers.
    //example: {1,3,8,7}->8
    public static int findFirstEven(int[] ints) {
       for(int i : ints){
           if (i % 2 == 0){
               return i;
           }
       }
        return 0;
    }

    //Map int[] to boolean[]. Program should map to "true" if the number is even, otherwise should map to "false".
    //example: {1,3,8,7}->{false, false, true, false}
    public static boolean[] areEven(int[] ints) {
        boolean[] booleans = new boolean[ints.length];
        for (int i = 0; i < booleans.length; i++) {
            if(ints[i] % 2 == 0)
                booleans[i] = true;
            // array[i] = ints[i] % 2 == 0; //tu tez podstawia false
        }
            return booleans;
    }

    //Map int[] to String[] in following pattern:
    //1 -> "one"
    //2 -> "two"
    //3 -> "three"
    //4 -> "four"
    //default -> "out of range"
    //example: {1,3,8,7}->{"one", "three", "out of range", "out of range"}
    public static String[] mapToString(int[] ints) {
        String[] strings = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
           strings[i] = mapToString(ints[i]);
        }
        return strings;
    }

    public static String mapToString(int ints){
        return switch (ints){
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                default -> "Out of range.";
        };
    }
    //metody mapToString dzialaja mimo identycznej nazwy bo maja rozne argumenty

    //Program should calculate average value of all integers in given array.
    //example: {1,3,8,7}->4.75
    public static double calculateAverage(int[] ints) {
    double sum = 0;
    for (double anDouble : ints){
        sum += anDouble;
    }
    double avg = sum / ints.length;
    return avg;
    }

    //program should return index in array "ints" of given element "value".
    // In case of element not found return -1.
    //example: {1,3,7,8}, 8 -> 2
    public static int getIndex(int[] ints, int value) {

        return 0;
    }

}
