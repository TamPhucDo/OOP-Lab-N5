public class Main {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(5.0f, 10.0f);
        
        System.out.println(rect.toString());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}