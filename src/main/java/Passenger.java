import java.util.List;

public class Passenger extends Person {

    private Ticket ticket;
    private double creditCardLimit;
    private String[] luggage;


    public Passenger(String person, Ticket ticket, double creditCardLimit, String[] luggage) {
        super(person);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }

    public String[] getLuggage() {
        return luggage;
    }

    public void setLuggage(String[] luggage) {
        this.luggage = luggage;
    }

    public int getAmtOfLuggage(){
    int count=luggage.length;
        return count;
    }
    public void printTicket(){

    }
}
