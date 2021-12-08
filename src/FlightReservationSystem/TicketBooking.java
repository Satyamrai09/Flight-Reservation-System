package FlightReservationSystem;

public abstract class TicketBooking{//using abstract keyword as the TicketBooking cannot be instantiated.
   private  String PNR;
   public String getPNR(){
       return PNR;
   }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    private  String departureTime;
    private String destination;
    private String flightBooked;
    private String dateOfDeparture;
    private String dateOfArrival;
    private String timeOfArrival;
    private String timeOfDeparture;
   private  int seatNumber;
   public int getSeatNumber(){
       return seatNumber;
   }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    private float ticketPrice;
   public float getTicketPrice(){
       return ticketPrice;
   }
   public void setTicketPrice(float ticketPrice){
       this.ticketPrice=ticketPrice;
   }
    boolean statusOfTicket;
   private String durationOfJourney;
Flight flight;
Passenger passenger;

    public boolean CancelTicket(){
       statusOfTicket=false;
        return false;
    }
 public String getDurationOfJourney(){

        return durationOfJourney;
    }

    public void setDurationOfJourney(String durationOfJourney) {
        this.durationOfJourney = durationOfJourney;
    }
    TicketBooking (String durationOfJourney){

        this.durationOfJourney=durationOfJourney;
    }
    TicketBooking(){

    }
    TicketBooking( String departureTime,String destination,String flightBooked,String dateOfDeparture,String dateOfArrival,String timeOfArrival,String timeOfDeparture, int seatNumber){
this.departureTime=departureTime;
this.destination=destination;
this.flightBooked=flightBooked;
this.dateOfDeparture=dateOfDeparture;
this.dateOfArrival=dateOfArrival;
this.timeOfArrival=timeOfArrival;
this.timeOfDeparture=timeOfDeparture;
this.seatNumber=seatNumber;
    }
}
