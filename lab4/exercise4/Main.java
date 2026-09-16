public class Main {
    public static void main(String[] args) {
        
        House house = new House("VILLA_01", 4, true, 100, 2500000);
        
        System.out.println(house.toString());
        System.out.println("Selling Price: " + (long) house.calculateSellingPrice()); 
    }
}