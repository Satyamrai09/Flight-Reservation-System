package FlightReservationSystem;

class TouristTicket extends TicketBooking {
    TouristTicket() {
        super();//parametrized constructor of parent class is called using super keyword.
    }

    private String hotelAddress;
    private String touristLocation;

    public String getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String touristLocation) {
        this.touristLocation = touristLocation;
    }
}