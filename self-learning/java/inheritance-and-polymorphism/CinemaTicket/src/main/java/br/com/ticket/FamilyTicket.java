package br.com.ticket;

public class FamilyTicket extends MovieTicket {
    private int quantity;

    public FamilyTicket(String movieName, double price, SessionType sessionType, int quantity) {
        super(movieName, price, sessionType);
        this.quantity = quantity;  
    }

    @Override
    public double getFinalPrice() {
        if(this.quantity > 3) return this.price * this.quantity * 0.95;
        else return this.price * this.quantity;
    }
}
