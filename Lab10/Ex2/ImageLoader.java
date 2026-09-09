class ImageLoader {

    private static ImageLoader instance;

    // Private constructor
    private ImageLoader() {}

    // Singleton method
    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }

    public String loadImage() {
        return "Loaded successfully.";
    }
}

