public class Main {
    public static void main(String[] args) {
        // Buat movie
        Movie m1 = new Movie("Dune: Part Two", "Sci-Fi", 165);
        Movie m2 = new Movie("Inside Out 2", "Animation", 100);

        // Buat jadwal
        Schedule s1 = new Schedule(m1, "14:00");
        Schedule s2 = new Schedule(m2, "17:30");

        // Buat cinema
        Cinema cinema = new Cinema();
        cinema.addSchedule(s1);
        cinema.addSchedule(s2);

        // Tampilkan jadwal
        cinema.showAllSchedules();

        // Booking tiket - Overload method!
        s1.bookTicket("Abil", "A1", false);   // Regular
        s1.bookTicket("Malik", "A2", true);   // VIP
        s2.bookTicket(new RegularTicket("Zahdan", "B1"));

        // Tampilkan tiket
        s1.showAllTickets();
        s2.showAllTickets();
    }
}
