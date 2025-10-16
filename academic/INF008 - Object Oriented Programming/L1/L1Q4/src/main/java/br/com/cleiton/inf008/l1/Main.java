package br.com.cleiton.inf008.l1;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- 1. Creating an item with the most complete constructor ---");
        InventoryItem laptop = new InventoryItem(
            "LP-15-PRO", 
            "15-inch Pro Laptop", 
            50, 
            10, 
            1250.75
        );

        System.out.println("\n--- 2. Applying a 15% discount ---");
        System.out.println("Price before discount: " + laptop.getUnitPrice());
        laptop.applyDiscount(15.0); // Applying a 15% discount
        System.out.println("Price after discount: " + laptop.getUnitPrice());

        System.out.println("\n--- 3. Updating stock (selling 45 items) ---");
        System.out.println("Stock before update: " + laptop.getQuantityInStock());
        laptop.updateStock(-45); // Sells 45 units
        System.out.println("Stock after update: " + laptop.getQuantityInStock());

        System.out.println("\n--- 4. Checking stock level ---");
        System.out.println("Is stock below minimum level (" + laptop.getMinimumStockLevel() + ")? " + laptop.isBelowMinimumStock()); // Should be true now

        System.out.println("\n--- 5. Updating stock (receiving 20 items) ---");
        laptop.updateStock(20); // Adds 20 units
        System.out.println("Stock after receiving new items: " + laptop.getQuantityInStock());
        System.out.println("Is stock below minimum level now? " + laptop.isBelowMinimumStock()); // Should be false now

        System.out.println("\n----------------------------------------------------");

        System.out.println("\n--- 6. Testing validations with a new item ---");
        // Creating an item using another constructor
        InventoryItem keyboard = new InventoryItem("KB-MECH-01", "Mechanical Keyboard");
        System.out.println("Attempting to set a negative price and stock...");
        
        keyboard.setUnitPrice(-99.99);
        keyboard.setQuantityInStock(-10);
        
        System.out.println("Price after setting a negative value: " + keyboard.getUnitPrice()); // Should be 0.0
        System.out.println("Stock after setting a negative value: " + keyboard.getQuantityInStock()); // Should be 0
    }
}