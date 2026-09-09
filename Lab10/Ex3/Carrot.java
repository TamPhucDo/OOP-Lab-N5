class Carrot implements Vegetable {
    private String type;

    public Carrot(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return "Carrot - Type: " + type;
    }
}