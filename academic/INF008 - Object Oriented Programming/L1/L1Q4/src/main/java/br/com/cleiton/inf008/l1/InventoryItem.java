package br.com.cleiton.inf008.l1;

public class InventoryItem {
    private String itemCode;
    private String description;
    private double unitPrice;
    private int quantityInStock;
    private int minimumStockLevel;

    public InventoryItem(String itemCode, String description) {
        setItemCode(itemCode);
        setDescription(description);
    }

    public InventoryItem(String itemCode, String description, int quantityInStock, int minimumStockLevel) {
        this(itemCode, description);
        setQuantityInStock(quantityInStock);
        setMinimumStockLevel(minimumStockLevel);
    }

    public InventoryItem(String itemCode, String description, int quantityInStock, int minimumStockLevel, double unitPrice) {
        this(itemCode, description, quantityInStock, minimumStockLevel);
        setUnitPrice(unitPrice);
    }

    public void applyDiscount(double percentage) {
        double discountAmount = this.unitPrice * (percentage / 100);
        double newUnitPrice = this.unitPrice - discountAmount;
        setUnitPrice(newUnitPrice);
    }

    public void updateStock() {
        setQuantityInStock(this.quantityInStock - 1);
    }

    public void updateStock(int quantity) {
        setQuantityInStock(this.quantityInStock + quantity);
    }

    public boolean isBelowMinimumStock() {
        return this.quantityInStock < this.minimumStockLevel;
    }

    public String getItemCode() { return itemCode; }
    public void setItemCode(String itemCode) { this.itemCode = itemCode; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) {
        if(unitPrice <= 0){
            this.unitPrice = 0;
        }else {
            this.unitPrice = unitPrice;
        }
    }

    public int getQuantityInStock() { return quantityInStock; }
    public void setQuantityInStock(int quantityInStock) {
        if(quantityInStock <= 0) {
            this.quantityInStock = 0;
        }else {
            this.quantityInStock = quantityInStock;
        }
    }

    public int getMinimumStockLevel() { return minimumStockLevel; }
    public void setMinimumStockLevel(int minimumStockLevel) {
        if(minimumStockLevel <= 0){
            this.minimumStockLevel = 0;
        }else{
            this.minimumStockLevel = minimumStockLevel;
        }
    }
}
