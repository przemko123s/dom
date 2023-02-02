package javaStart;

class MyPoint3D extends MyPoint2D {
    private int z;
    public MyPoint3D( int x, int y, int z ) {
        super(x, y);         // wywołanie dwuparametrowego konstruktora klasy nadrzędnej
        this.z = z;
    }

    public void getInfo() {  // przesłonięta metoda klasy nadrzędnej
        super.getInfo();     // za pomocą operatora super, można
        // dostać się do metod klasy nadrzędnej
        System.out.print( "\tz=" + z );
    }
}