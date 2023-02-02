package javaStart;

class MyPoint2D {
    private int x;
    private int y;
    public MyPoint2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void getInfo() {
        System.out.print( "Punkt:\tx=" + x + "\ty=" + y);
        // symbol "\t" - interpretowany jest jako tabulacja
    }
}