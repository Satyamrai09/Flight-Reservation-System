package FlightReservationSystem;

public class Flight {
    long flightNumber;
    String airlineOfFlight;
    int capacityOfFlight;
    int seatBooked;
    int totalSeats;
    public  int availabilityOfSeats(int totalSeats, int seatBooked){
        int vacantSeats=totalSeats-seatBooked;
       return vacantSeats;

    }
    Flight (int totalSeats, int seatBooked){
        this.seatBooked=seatBooked;
        this.totalSeats=totalSeats;
    }


}
