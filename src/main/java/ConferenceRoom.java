import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int numberInConferenceRoom() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (spareCapacity() && !containsGuest(guest)) {
            this.guests.add(guest);
        }
    }

    public boolean spareCapacity() {
        return (numberInConferenceRoom() < this.capacity);
    }

    public void removeGuest(Guest guest) {
        if (containsGuest(guest)) {
            this.guests.remove(guest);
        }
    }

    public boolean containsGuest(Guest guest) {
        return this.guests.contains(guest);
    }
}
