package br.com.ticket;

public class RegularTicket extends MovieTicket {
    public RegularTicket(String movieName, double price, SessionType sessionType) {
        super(movieName, price, sessionType);
    }

    @Override
    public double getFinalPrice() { return this.price; }
}
