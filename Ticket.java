public abstract class Ticket implements Printable {
    private String customerName;
    private String seatNumber;

    public Ticket(String customerName, String seatNumber) {
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getSeatNumber() { return seatNumber; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public abstract double getPrice();
}
