import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String type, int nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public int numberInRoom() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (numberInRoom() < this.capacity && !containsGuest(guest)) {
            guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        if (containsGuest(guest)) {
            guests.remove(guest);
        }
    }

    public boolean containsGuest(Guest guest) {
        return guests.contains(guest);
    }
}
