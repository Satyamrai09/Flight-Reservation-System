package FlightReservationSystem;

public class RegularTicket extends TicketBooking {
   private String Food;

    RegularTicket(String durationOfJourney) {
        super(durationOfJourney);
    }

    public String getFood(){
       return Food;
   }

    public void setFood(String Food) {
        this.Food=Food;
    }

    String Water;
    String Snacks;

}
