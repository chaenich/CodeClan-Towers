public class Booking {
    private int nights;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights() {
        return nights;
    }

    public int calculateTotalBill() {
        return bedroom.getNightlyRate() * nights;
    }
}
