public class VIPTicket extends Ticket {
    public VIPTicket(String customerName, String seatNumber) {
        super(customerName, seatNumber);
    }

    @Override
    public double getPrice() {
        return 100_000; // Rp 100.000
    }

    @Override
    public void printTicket() {
        System.out.println("[VIP] Ticket for " + getCustomerName() + " | Seat: " + getSeatNumber() + " | Price: Rp " + getPrice());
    }
}
