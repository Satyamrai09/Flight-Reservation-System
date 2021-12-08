package FlightReservationSystem;

public  class TicketBooking {
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
}
