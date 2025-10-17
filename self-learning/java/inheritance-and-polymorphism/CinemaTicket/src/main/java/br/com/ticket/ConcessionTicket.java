package br.com.ticket;

public class ConcessionTicket extends MovieTicket{
    public ConcessionTicket(String movieName, double price, SessionType sessionType) {
        super(movieName, price, sessionType);
    }

    @Override
    public double getFinalPrice(){ return this.price * 0.5; }
}
