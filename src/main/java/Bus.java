import java.util.ArrayList;

public class Bus {
    private ArrayList<Person> passengers;
    private int capacity;
    private ArrayList<String> destinations;

    // newing it up
    public Bus(){
        this.passengers = new ArrayList<>();
        this.capacity = 53;
        this.destinations = new ArrayList<>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }


    public int returnCapacity(){
        return this.capacity;
    }

    public void addPassenger(Person passenger){
        if (passengerCount() < this.capacity) {
            this.passengers.add(passenger);
        }
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }

    
}
