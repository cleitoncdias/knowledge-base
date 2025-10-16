public class Main {
    public static void main(String[] args) {
        // 1. Testing the most complete constructor
        System.out.println("--- Creating register 'CX-001' with initial values ---");
        CashRegister register1 = new CashRegister("CX-001", 100.0, 5);
        
        // Printing the initial report
        System.out.println(register1.getDailyReport());

        // 2. Testing the overloaded payment methods
        System.out.println("\n--- Processing transactions ---");
        register1.processPayment(50); // Payment with int
        register1.processPayment(25.75); // Payment with double
        register1.processPayment(10.00, "Sale of candy"); // Payment with description

        // 3. Testing the refund method
        register1.processRefund(15.50);

        // 4. Displaying the final report
        System.out.println("\n--- Final Report ---");
        System.out.println(register1.getDailyReport());
        
        System.out.println("=============================================\n");

        // 5. Testing the simplest constructor
        System.out.println("--- Creating a new register 'CX-002' from scratch ---");
        CashRegister register2 = new CashRegister("CX-002");
        System.out.println(register2.getDailyReport());
        register2.processPayment(99.99, "First sale of the day");
        System.out.println(register2.getDailyReport());
    }
}