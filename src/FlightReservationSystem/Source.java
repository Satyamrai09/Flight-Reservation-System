package FlightReservationSystem;

public class Source {
    public static void main (String[] args){
        Flight f1= new Flight(0,0);
        int a= f1.availabilityOfSeats(50,20);
        System.out.println(a);
        f1.flightNumber=239;
        f1.airlineOfFlight="Air Asia";
        f1.capacityOfFlight=60;
        System.out.println(f1.flightNumber+" "+f1.airlineOfFlight+" Capacity of Fligth="+ f1.capacityOfFlight);
        TicketBooking T1=new TicketBooking("1:30");
        System.out.println(T1.getDurationOfJourney());
        Passenger P1=new Passenger(12);
        System.out.println(P1.getId());



    }
}
