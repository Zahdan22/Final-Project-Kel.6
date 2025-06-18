import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private Movie movie;
    private String showTime;
    private List<Ticket> tickets;

    public Schedule(Movie movie, String showTime) {
        this.movie = movie;
        this.showTime = showTime;
        this.tickets = new ArrayList<>();
    }

    public Movie getMovie() { return movie; }
    public String getShowTime() { return showTime; }

    // Overloading: 2 cara pemesanan tiket
    public void bookTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Booked ticket for: " + ticket.getCustomerName());
    }

    public void bookTicket(String customerName, String seatNumber, boolean isVIP) {
        Ticket ticket = isVIP ? new VIPTicket(customerName, seatNumber)
                              : new RegularTicket(customerName, seatNumber);
        bookTicket(ticket);
    }

    public void showAllTickets() {
        System.out.println("🎟️ Tickets for " + movie.getTitle() + " at " + showTime + ":");
        for (Ticket t : tickets) {
            t.printTicket();
        }
    }

    public void showScheduleInfo() {
        movie.displayInfo();
        System.out.println("Showtime: " + showTime);
    }
}
