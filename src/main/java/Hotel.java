import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom>conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int numberOfBedrooms() {
        return bedrooms.size();
    }

    public int numberOfConferenceRooms() {
        return conferenceRooms.size();
    }

    public void checkGuestInToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkGuestOutOfBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
    public void checkGuestInToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }
    public void checkGuestOutOfConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }
}
