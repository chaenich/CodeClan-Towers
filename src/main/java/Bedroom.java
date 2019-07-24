import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
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

    public int numberInRoom() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (numberInRoom() < this.capacity) {
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
