package homework.homework_12.homework_12_2;

public class Wardrobe extends FurnitureForStoring {
    private final boolean hasClothesRail;

    public Wardrobe(int numberOfLegs, double price, double weightCapacity, int numberOfShelves, boolean hasClothesRail) {
        super(numberOfLegs, price, weightCapacity, numberOfShelves);
        this.hasClothesRail = hasClothesRail;
    }
}
