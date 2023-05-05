package com.CompletedBackups.Day37;

public class RunWarPreparations {
    public static void main(String[] args) {

        Sword swordNr1 = new Sword(MaterialType.IRON, GemstoneType.BITSTONE, 55, 15);
        Sword swordNr2 = Sword.withMaterial(MaterialType.WOOD);
        Sword swordNr3 = Sword.withMaterial(MaterialType.BINARIUM);

        System.out.println(swordNr1);
        System.out.println(swordNr2);
        System.out.println(swordNr3);
    }

    /*
    Day 37 Challenge: War Preparations 100 XP

As you pass through the city of Rocaard, two blacksmiths, Cygnus and Lyra, approach you. “We know where this is headed. A
confrontation with the Uncoded One’s forces,” Lyra says. Cygnus continues, “You’re going to need an army at your side—one
prepared to do battle. We forge enchanted swords and will do everything we can to support this cause. We need the Power of
Programming to flow unfettered too. We want to help, but we can’t equip an entire army without the help of a program to aid in
crafting swords.” They describe the program they need, and you dive in to help.
ObjectivesObjectives:
Swords can be made out of any of the following materials: wood, bronze, iron, steel, and the rare binarium. Create an
enumeration to represent the material type.
Gemstones can be attached to a sword, which gives them strange powers through Cygnus and Lyra’s touch. Gemstone
types include emerald, amber, sapphire, diamond, and the rare bitstone. Or no gemstone at all. Create an enumeration to
represent a gemstone type.
Create a Sword record with a material, gemstone, length, and crossguard width.
In your main program, create a basic Sword instance made out of iron and with no gemstone. Then create two variations
on the basic sword, defining methods in Sword that produce a modified copy, like Sword withMaterial(Material
material) .
Give sword a toString method that produces output like "a steel sword of 85 centimetres long, a crossguard width of 19
cm, and an embedded ruby" or "a plain binarium sword of 55 centimetres long and a crossguard width of 15 cm"
Display all three sword instances with code like System.out.println(original);.

     */
}
