package br.com.ticket;

public class MovieTicket {
    private String movieName;
    protected double price;
    private SessionType sessionType;

    public MovieTicket(String movieName, double price, SessionType sessionType) {
        this.movieName = movieName;
        this.price = price;
        this.sessionType = sessionType;
    }

    public double getFinalPrice() { return this.price; }
}
