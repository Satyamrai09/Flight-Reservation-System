package FlightReservationSystem;

public class Source {
    public static void main(String[] args) {
        Flight f1 = new Flight(0, 14);
        int a = f1.availabilityOfSeats(50, 20);
        System.out.println(a);


        Passenger P1 = new Passenger(12);
        System.out.println(P1.getId());
        System.out.println(P1.getPassengerMethod());
        System.out.println(f1.getSeatBooked());
        RegularTicket rtt1 = new RegularTicket();

        TicketBooking ticketBooking = new TicketBooking("454654") {
        };
        TouristTicket tr2 = new TouristTicket();//object of touristTicket class 'tr2'
        RegularTicket rt2 = new RegularTicket();//object of regularTicket class 'rt2'

        tr2.printTicketDetails(ticketBooking);//printing pnr of touristTicket class
        rt2.printTicketDetails(ticketBooking);//printing pnr on regularTicket class


    }
}
