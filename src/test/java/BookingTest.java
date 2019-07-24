import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(1, 4, "Family", 10000);
        booking1 = new Booking(bedroom1, 4);
    }

    @Test
    public void bookingHasRoom() {
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void bookingHasNights() {
        assertEquals(4, booking1.getNights());
    }

    @Test
    public void canCalculateTotalBill() {
        assertEquals(40000, booking1.calculateTotalBill());
    }
}