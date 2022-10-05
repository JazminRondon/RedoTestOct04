public class PlaneTicket extends Ticket{

    public PlaneTicket(int id, String orgin, String destination, String seatNumber, double price) {
        super(id, orgin, destination, seatNumber, price);
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(getPrice());
    }

}
