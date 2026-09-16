public class Main {
    public static void main(String[] args) {
        
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(3.5f, 5.5f);
        
        System.out.println("p1: X=" + p1.getX() + ", Y=" + p1.getY());
        System.out.println("p2: X=" + p2.getX() + ", Y=" + p2.getY());
    }
}