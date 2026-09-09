class Pumpkin implements Vegetable {
    private double weight;

    public Pumpkin(double weight) {
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return "Pumpkin - Weight: " + weight;
    }
}