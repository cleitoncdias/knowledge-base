package br.com.ticket;

public abstract class MovieTicket {
    private String movieName;
    protected double price;
    private SessionType sessionType;

    public MovieTicket(String movieName, double price, SessionType sessionType) {
        this.movieName = movieName;
        this.price = price;
        this.sessionType = sessionType;
    }

    public abstract double getFinalPrice();
}
