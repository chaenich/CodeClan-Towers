import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(2, "FirstRoom");
        guest1 = new Guest("Mary");
        guest2 = new Guest("Helen");
        guest3 = new Guest("Jo");
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("FirstRoom", conferenceRoom.getName());
    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(2, conferenceRoom.getCapacity());
    }
    @Test
    public void conferenceRoomIsEmpty() {
        assertEquals(0, conferenceRoom.numberInConferenceRoom());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.numberInConferenceRoom());
    }

    @Test
    public void cannotAddGuestIfFull() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        assertEquals(2, conferenceRoom.numberInConferenceRoom());
    }

    @Test
    public void haveSpareCapacity() {
        conferenceRoom.addGuest(guest1);
        assertEquals(true, conferenceRoom.spareCapacity());
    }
    @Test
    public void haveNoSpareCapacity() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        assertEquals(false, conferenceRoom.spareCapacity());
    }
    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest2);
        assertEquals(1, conferenceRoom.numberInConferenceRoom());
        assertEquals(true, conferenceRoom.containsGuest(guest1));
    }

    @Test
    public void roomContainsGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(true, conferenceRoom.containsGuest(guest1));
    }
    @Test
    public void roomDoesNotContainGuest() {
        conferenceRoom.addGuest(guest2);
        assertEquals(false, conferenceRoom.containsGuest(guest1));
    }

    @Test
    public void cannotRemoveGuestNotInConferenceRoom() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest(guest2);
        assertEquals(1, conferenceRoom.numberInConferenceRoom());
        assertEquals(true, conferenceRoom.containsGuest(guest1));
    }
    @Test
    public void cannotAddGuestAlreadyInConferenceRoom() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.numberInConferenceRoom());
    }

}
