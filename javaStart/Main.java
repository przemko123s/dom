package javaStart;

class Main {
    public static void main( String[] args ) {
        MyPoint2D point2D = new MyPoint2D(-1, -2);
        point2D.getInfo();
        System.out.println();
        MyPoint3D point3D = new MyPoint3D(3, 4, 5);
        point3D.getInfo();
    }
}