import java.util.List;

public class Passenger extends Person {

    private Ticket ticket;
    private double creditCardLimit;
    private String[] luggage;


    public Passenger(String name, Ticket ticket, double creditCardLimit, String[] luggage) {
        super(name);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }
//    public Passenger(String name){
//        super(name);
//    }


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

        System.out.println(this.ticket);
    }

}
