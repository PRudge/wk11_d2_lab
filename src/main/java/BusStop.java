import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int queueSize(){
        return this.queue.size();
    }

    public void addPassengerToQueue(Person passenger){
        this.queue.add(passenger);
    }

    public Person removePassengerFromQueue(){
        return this.queue.remove(0);
    }


}
