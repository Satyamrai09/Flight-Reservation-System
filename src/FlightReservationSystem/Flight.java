package FlightReservationSystem;

public class Flight {
    //encapsulation using private access modifier.
   private long flightNumber;
    private String airlineOfFlight;
    private int capacityOfFlight;
   private  int seatBooked;
   public int getSeatBooked(){
       return seatBooked;
   }
   public void setSeatBooked(int seatBooked){
       this.seatBooked=seatBooked;
   }
   private int totalSeats;

    public Flight() {

    }

    public  int availabilityOfSeats(int totalSeats, int seatBooked){
        int vacantSeats=totalSeats-seatBooked;
       return vacantSeats;

    }
    Flight (int totalSeats, int seatBooked){
        this.seatBooked=seatBooked;
        this.totalSeats=totalSeats;
    }


}
