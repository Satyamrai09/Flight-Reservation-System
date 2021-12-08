package FlightReservationSystem;

public  class TicketBooking {
    String PNR;
    String departureTime;
    String destination;
    String flightBooked;
    String dateOfDeparture;
    String dateOfArrival;
    String timeOfArrival;
    String timeOfDeparture;
    int seatNumber;
    float ticketPrice;
    boolean statusOfTicket;
   private String durationOfJourney;

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
}
