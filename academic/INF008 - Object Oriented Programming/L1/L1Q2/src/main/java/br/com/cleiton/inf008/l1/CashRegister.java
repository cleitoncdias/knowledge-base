package br.com.cleiton.inf008.l1;

public class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public CashRegister(String registerId) {
        setRegisterId(registerId);
    }

    public CashRegister(String registerId, double currentBalance) {
        this(registerId);
        setCurrentBalance(currentBalance);
    }

    public CashRegister(String registerId, double currentBalance, int transactionCount) {
        this(registerId, currentBalance);
        setTransactionCount(transactionCount);
    }

    public String getRegisterId() { return this.registerId; }
    public void setRegisterId(String registerId) { this.registerId = registerId; }

    public double getCurrentBalance() { return this.currentBalance; }
    public void setCurrentBalance(double currentBalance) { this.currentBalance = currentBalance; }

    public int getTransactionCount() { return this.transactionCount; }
    public void setTransactionCount(int transactionCount) { this.transactionCount = transactionCount; }
    
    public void processPayment(int amount){
        this.currentBalance += amount;
        this.transactionCount++;
        System.out.println("$ " + amount + " added to the register.");
    }
    public void processPayment(double amount){
        this.currentBalance += amount;
        this.transactionCount++;
        System.out.println("$ " + amount + " added to the register.");
    }

    public void processPayment(double amount, String description){
        this.currentBalance += amount;
        this.transactionCount++;
        System.out.println("$ " + amount + " added to the register. " + description + "\n");
    }    

    public void processRefund(double amount){
        this.currentBalance -= amount;
        this.transactionCount++;
        System.out.println("$ " + amount + " removed from the register.");
    }

    public String getDailyReport(){
        return String.format(
            "---DAILY REPORT ---\n" +
            "Register ID: %s\n" +
            "Total Transactions: %d\n" +
            "Final Balance: $ %.2f\n",
            this.getRegisterId(), this.getTransactionCount(), this.getCurrentBalance()
        );
    }
}
