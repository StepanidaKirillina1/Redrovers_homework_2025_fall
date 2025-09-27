package homework.homework_12.homework_12_2;

public abstract class FurnitureForSitting extends Furniture {
    private String upholsteryMaterial;

    public FurnitureForSitting(int numberOfLegs, double price, double weightCapacity, String upholsteryMaterial) {
        super(numberOfLegs, price, weightCapacity);
        this.upholsteryMaterial = upholsteryMaterial;
    }

    public String getUpholsteryMaterial() {
        return upholsteryMaterial;
    }
}
