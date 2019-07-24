import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    private Guest guest;

    @Test
    public void canGetGuestName() {
        guest = new Guest("Bob");
        assertEquals("Bob", guest.getGuestName());
    }

}
