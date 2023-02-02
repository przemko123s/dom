public class test {
    public static void main(String args[]) {
        int[] tablica = new int[10];
        int[] tablicaminus = new int[10];

        //wypełnienie tablicy
        for (int i = 0; i < 10; i++) {
            tablica[i] = i+1;
        }
        int j = 10;
        for (int i = 0; i < 10; i++) {
            tablicaminus[i] = j;
            j--;
        }

        //wyświetlenie przy użyciu pętli for each
        for (int x : tablica) {
            System.out.print(x);
        }
        System.out.println();
        for (int y : tablicaminus) {
            System.out.println(y);
        }
    }
}