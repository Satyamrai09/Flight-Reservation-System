package FlightReservationSystem;

public class Source {
    public static void main (String[] args){
        Flight f1= new Flight(0,14);
        int a= f1.availabilityOfSeats(50,20);
        System.out.println(a);



        Passenger P1=new Passenger(12);
        System.out.println(P1.getId());
        System.out.println(P1.getPassengerMethod());
        System.out.println(f1.getSeatBooked());
        TouristTicket Trt1=new TouristTicket();



    }
}
