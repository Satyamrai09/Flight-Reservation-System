package FlightReservationSystem;

public class RegularTicket extends TicketBooking {
    RegularTicket(){
        super();  //parametrized constructor of parent class is called using super keyword.
    }
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

    private String Water;
    private String Snacks;

}
