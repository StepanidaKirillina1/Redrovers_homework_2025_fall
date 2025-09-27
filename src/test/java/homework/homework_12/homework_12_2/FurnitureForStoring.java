package homework.homework_12.homework_12_2;

public abstract class FurnitureForStoring extends Furniture {
    private final int numberOfShelves;

    public FurnitureForStoring(int numberOfLegs, double price, double weightCapacity, int numberOfShelves) {
        super(numberOfLegs, price, weightCapacity);
        this.numberOfShelves = numberOfShelves;
    }
}
