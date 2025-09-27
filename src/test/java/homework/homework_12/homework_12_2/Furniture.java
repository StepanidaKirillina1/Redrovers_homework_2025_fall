package homework.homework_12.homework_12_2;

public abstract class Furniture {
    private final int numberOfLegs;
    private double price;
    private final double weightCapacity;

    public Furniture(int numberOfLegs, double price, double weightCapacity) {
        this.numberOfLegs = numberOfLegs;
        this.price = price;
        this.weightCapacity = weightCapacity;
    }

    public int getLegsOfFurniture() {
        return numberOfLegs;
    }

    public double getPrice() {
        return price;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }
}
