// Test
public class MainEx2 {
    public static void main(String[] args) {
        ImageLoader loader1 = ImageLoader.getInstance();
        ImageLoader loader2 = ImageLoader.getInstance();

        System.out.println(loader1.loadImage());

        // Check singleton
        System.out.println(loader1 == loader2); // true
    }
}