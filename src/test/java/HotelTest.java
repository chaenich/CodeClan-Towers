import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Booking exampleBooking;

    @Before
    public void before() {
//      hotel = new Hotel();
      bedroom1 = new Bedroom(1, 2, "Double", 4000);
      bedroom2 = new Bedroom(2, 1, "Single", 2000);
      conferenceRoom1 = new ConferenceRoom(2, "Balmoral");
      conferenceRoom2 = new ConferenceRoom(10, "Big Room");
      guest1 = new Guest("Bob");
      guest2 = new Guest("Liz");
      bedrooms = new ArrayList<Bedroom>();
      conferenceRooms = new ArrayList<ConferenceRoom>();
      bedrooms.add(bedroom1);
      bedrooms.add(bedroom2);
      conferenceRooms.add(conferenceRoom1);
      conferenceRooms.add(conferenceRoom2);
      hotel = new Hotel(bedrooms, conferenceRooms);
    }

//    @Test
//    public void bedroomArrayListInitiallyEmpty() {
//        assertEquals(0, hotel.numberOfBedrooms());
//    }
//
//    @Test
//    public void conferenceRoomsArrayListInitiallyEmpty() {
//        assertEquals(0, hotel.numberOfConferenceRooms());
//    }

    @Test
    public void hotelConstructedWithExpectedNumberOfBedrooms() {
        assertEquals(2, hotel.numberOfBedrooms());
    }

    @Test
    public void hotelConstructedWithExpectedNumberOfConferenceRooms() {
        assertEquals(2, hotel.numberOfConferenceRooms());
    }

    @Test
    public void canCheckInGuestToBedroom() {
        hotel.checkGuestInToBedroom(guest1, bedroom1);
        assertEquals(true, bedroom1.containsGuest(guest1));
    }

    @Test
    public void canCheckGuestOutOfBedroom() {
        hotel.checkGuestInToBedroom(guest1, bedroom1);
        hotel.checkGuestInToBedroom(guest2, bedroom1);
        hotel.checkGuestOutOfBedroom(guest1, bedroom1);
        assertEquals(true, bedroom1.containsGuest(guest2));
        assertEquals(false, bedroom1.containsGuest(guest1));
    }
    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.checkGuestInToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(true, conferenceRoom1.containsGuest(guest1));
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom() {
        hotel.checkGuestInToConferenceRoom(guest1, conferenceRoom1);
        hotel.checkGuestInToConferenceRoom(guest2, conferenceRoom1);
        hotel.checkGuestOutOfConferenceRoom(guest1, conferenceRoom1);
        assertEquals(true, conferenceRoom1.containsGuest(guest2));
        assertEquals(false, conferenceRoom1.containsGuest(guest1));
    }

    @Test
    public void canMakeBooking() {
        assertEquals(bedroom1, (hotel.bookRoom(bedroom1, 4)).getBedroom());
        assertEquals(4, (hotel.bookRoom(bedroom1, 4)).getNights());
    }

}

