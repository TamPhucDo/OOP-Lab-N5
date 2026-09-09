public class MainEx3 {
    public static void main(String[] args) {

        Vegetable v1 = VegetableFactory.getVegetable("carrot");
        Vegetable v2 = VegetableFactory.getVegetable("cabbage");
        Vegetable v3 = VegetableFactory.getVegetable("pumpkin");

        System.out.println(v1.getInfo());
        System.out.println(v2.getInfo());
        System.out.println(v3.getInfo());
    }
}