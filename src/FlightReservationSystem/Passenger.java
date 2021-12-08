package FlightReservationSystem;

public class Passenger {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Address address = new Passenger.Address();
    Contact contact = new Passenger.Contact();
    private static int idCounter = 0;

    Passenger(int id) {
        id = idCounter++;
    }
    Passenger(){

    }
    public int  getPassengerMethod(){
        return idCounter;
    }


    private static class Address {
        private String addressStreet;

        public String getAddressStreet() {
            return addressStreet;
        }

        public void setAddressStreet(String addressStreet) {
            this.addressStreet = addressStreet;
        }

        private String addressCity;

        public String getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(String addressCity) {
            this.addressCity = addressCity;
        }

        String addressState;
    }

    private static class Contact {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String phoneNumber;

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        String Email;
    }
}