class VegetableFactory {

    public static Vegetable getVegetable(String type) {

        if (type.equalsIgnoreCase("carrot")) {
            return new Carrot("Organic");
        }

        else if (type.equalsIgnoreCase("cabbage")) {
            return new Cabbage("Green", 2.5);
        }

        else if (type.equalsIgnoreCase("pumpkin")) {
            return new Pumpkin(5.0);
        }

        return null;
    }
}