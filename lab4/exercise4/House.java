public class House {
    private String houseCode = "A01";
    private int numOfBedRooms = 2;
    private boolean hasSwimmingPool = false;
    private double area = 0;
    private double costPerSquareMeter = 0;

    public House() {
    }

    public House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public String getHouseCode() { return houseCode; }
    public void setHouseCode(String houseCode) { this.houseCode = houseCode; }

    public int getNumOfBedRooms() { return numOfBedRooms; }
    public void setNumOfBedRooms(int numOfBedRooms) { this.numOfBedRooms = numOfBedRooms; }

    public boolean isHasSwimmingPool() { return hasSwimmingPool; }
    public void setHasSwimmingPool(boolean hasSwimmingPool) { this.hasSwimmingPool = hasSwimmingPool; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }

    public double getCostPerSquareMeter() { return costPerSquareMeter; }
    public void setCostPerSquareMeter(double costPerSquareMeter) { this.costPerSquareMeter = costPerSquareMeter; }

    public double calculateSellingPrice() {
        double subTotal = this.area * this.costPerSquareMeter;
        if (this.hasSwimmingPool) {
            subTotal += subTotal * 0.10;
        }
        return subTotal + (subTotal * 0.15);
    }

    @Override
    public String toString() {
        return "House[" + houseCode + ", " + numOfBedRooms + ", " + hasSwimmingPool + ", " + calculateSellingPrice() + "]";
    }
}