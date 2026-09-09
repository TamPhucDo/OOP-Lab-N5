class Cabbage implements Vegetable {
    private String type;
    private double weight;

    public Cabbage(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return "Cabbage - Type: " + type + ", Weight: " + weight;
    }
}