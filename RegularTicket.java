public class RegularTicket extends Ticket {
    public RegularTicket(String customerName, String seatNumber) {
        super(customerName, seatNumber);
    }

    @Override
    public double getPrice() {
        return 50_000; // Rp 50.000
    }

    @Override
    public void printTicket() {
        System.out.println("[REGULAR] Ticket for " + getCustomerName() + " | Seat: " + getSeatNumber() + " | Price: Rp " + getPrice());
    }
}
