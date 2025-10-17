package br.com.ticket;

public class Main {

    public static void main(String[] args) {
        
        // --- Setup ---
        String movieTitle = "Dune: Part Two";
        double basePrice = 40.00;

        System.out.println("--- Cinema Ticket System ---");
        System.out.println("Movie: " + movieTitle);
        System.out.println("Base Ticket Price: $" + String.format("%.2f", basePrice));
        System.out.println("--------------------------------\n");

        // --- Creating different ticket types using Polymorphism ---
        MovieTicket regularTicket = new MovieTicket(movieTitle, basePrice, SessionType.SUBBED);
        
        MovieTicket halfPriceTicket = new ConcessionTicket(movieTitle, basePrice, SessionType.DUBBED);
        
        MovieTicket familyOf3 = new FamilyTicket(movieTitle, basePrice, SessionType.DUBBED, 3);
        
        MovieTicket familyOf4WithDiscount = new FamilyTicket(movieTitle, basePrice, SessionType.DUBBED, 4);

        // --- Calling the SAME method on different objects ---        
        System.out.println("Calculating final prices...");
        
        System.out.printf("Regular Ticket Final Price: $%.2f\n", regularTicket.getFinalPrice());
        
        System.out.printf("Concession (Half-Price) Ticket Final Price: $%.2f\n", halfPriceTicket.getFinalPrice());
        
        System.out.printf("Family Ticket (3 people) Final Price: $%.2f\n", familyOf3.getFinalPrice());
        
        System.out.printf("Family Ticket (4 people with 5%% discount) Final Price: $%.2f\n", familyOf4WithDiscount.getFinalPrice());

    }
}