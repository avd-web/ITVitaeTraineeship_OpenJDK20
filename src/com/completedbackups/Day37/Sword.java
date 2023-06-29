package com.completedbackups.Day37;

public record Sword(MaterialType material, GemstoneType gemstone, int length, int crossguardWidth) {
    public static Sword withMaterial(MaterialType material) {
        GemstoneType BASIC_GEMSTONE_TYPE = GemstoneType.EMPTY;
        int BASIC_SWORD_LENGTH = 55;
        int BASIC_CROSSGUARD_WIDTH = 15;
        return new Sword(
                material,
                BASIC_GEMSTONE_TYPE,
                BASIC_SWORD_LENGTH,
                BASIC_CROSSGUARD_WIDTH);
    }

    @Override
    //Build up a string with a string builder object to create the right toString return format.
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("a");
        if (material.equals(MaterialType.IRON)) {
            string.append("n");
        }
        string.append(" ");
        if (this.gemstone.equals(GemstoneType.EMPTY)) {
            string.append("plain ");
            string.append(material.name().toLowerCase());
            string.append(" sword of ");
            string.append(length);
            string.append(" centimeters long, and crossguard of width of ");
            string.append(crossguardWidth);
            string.append(" cm");
        } else {
            string.append(material.name().toLowerCase());
            string.append(" sword of ");
            string.append(length);
            string.append(" centimeters long, a crossguard of width of ");
            string.append(crossguardWidth);
            string.append(" cm");
            string.append(", and an embedded ");
            string.append(gemstone.name());
        }
        return string.toString();
    }
}

