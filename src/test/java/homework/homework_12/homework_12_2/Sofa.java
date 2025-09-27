package homework.homework_12.homework_12_2;

public class Sofa extends FurnitureForSitting {
    private final boolean hasStorageDrawers;

    public Sofa(int numberOfLegs, double price, double weightCapacity, String upholsteryMaterial, boolean hasStorageDrawers) {
        super(numberOfLegs, price, weightCapacity, upholsteryMaterial);
        this.hasStorageDrawers = hasStorageDrawers;
    }
}
