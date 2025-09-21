package homework.homework_9;

// https://www.codewars.com/kata/building-blocks/train/java

public class Block {

    private final int width;
    private final int length;
    private final int height;

    public Block (int[] block) {
        this.width = block[0];
        this.length = block[1];
        this.height = block[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return (width * height + width * length + height * length) * 2;
    }
}
