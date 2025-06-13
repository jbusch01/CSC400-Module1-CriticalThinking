public class BagDemo {
    public static void main(String[] args) {
        // Create a Bag of Strings
        Bag<String> bag = new Bag<>();

        // Add elements to the bag
        bag.add("Sword");
        bag.add("Potion");
        bag.add("Potion");
        bag.add("Spear");
        bag.add("Helmet");
        bag.add("Sword");
        bag.add("Potion");
        bag.add("Potion");
        bag.add("Potion");
        bag.add("Potion");
        bag.add("Potion");
        bag.add("Gauntlets");
        bag.add("Potion");
        bag.add("Potion");
        bag.add("Helmet");
        bag.add("Gauntlets");
        bag.add("Potion");

        // Print contents
        System.out.println("Bag Inventory:");
        System.out.println(bag);

        // Test contains method
        System.out.println("Contains Potions? " + bag.contains("Potion") + ".");
        System.out.println("Contains Gauntlet? " + bag.contains("Gauntlets") + ".\n");

        // Test count method
        System.out.println("There are " + bag.count("Helmets") + " helmet(s) in your inventory.");
        System.out.println("Your Inventory has " + bag.count("Sword") + " sword(s).");

        // Remove one 'Potion'
        bag.remove("Potion");

        // Print contents after removing item
        System.out.println(("\nBag contents after removing one potion."));
        System.out.println(bag);

        // Test contains and count again
        System.out.println("Contains Potions? " + bag.contains("Potion") + ".");
        System.out.println("Potions remaining - " + bag.count("Potion") + "\n");
        }
}