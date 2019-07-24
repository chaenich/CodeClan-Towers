import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Guest guest2;


    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 2, "double");
        bedroom2 = new Bedroom(2, 1, "single");
        guest1 = new Guest("Bob");
        guest2 = new Guest("Jim");
    }

    @Test
    public void bedroomHasNumber() {
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void bedroomHasCapacity() {
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void bedroomHasType() {
        assertEquals("double", bedroom1.getType());
    }

    @Test
    public void bedroomInitiallyEmpty() {
        assertEquals(0, bedroom1.numberInRoom());
    }

    @Test
    public void canAddGuest(){
        bedroom2.addGuest(guest2);
        assertEquals(1, bedroom2.numberInRoom());
    }

    @Test
    public void cannotAddGuestIfFull() {
        bedroom2.addGuest(guest1);
        bedroom2.addGuest(guest2);
        assertEquals(1, bedroom2.numberInRoom());
    }

    @Test
    public void canRemoveGuest() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        bedroom1.removeGuest(guest2);
        assertEquals(1, bedroom1.numberInRoom());
        assertEquals(true, bedroom1.containsGuest(guest1));
    }

    @Test
    public void cannotRemoveGuestNotInRoom() {
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest2);
        assertEquals(1, bedroom1.numberInRoom());
        assertEquals(true, bedroom1.containsGuest(guest1));
    }

}
