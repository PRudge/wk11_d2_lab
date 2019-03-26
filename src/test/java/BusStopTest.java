import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Person passenger;
    Bus bus;
    BusStop busStop;


    @Before
    public void before(){
        busStop = new BusStop("Princes Street");
        bus = new Bus();
        passenger = new Person();
    }

    @Test
    public void canGetQueueSize(){
        assertEquals(0,busStop.queueSize());
    }

    @Test
    public void canAddPassengerToQueue(){
        busStop.addPassengerToQueue(passenger);
        assertEquals(1,busStop.queueSize());

    }

    @Test
    public void canRemovePassenger(){
        busStop.addPassengerToQueue(passenger);
        assertEquals(1,busStop.queueSize());
        busStop.removePassengerFromQueue();
        assertEquals(0,busStop.queueSize());
    }

    @Test
    public void canMovePassengerFromBustStopToBus(){
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        assertEquals(3,busStop.queueSize());
        bus.addPassenger(busStop.removePassengerFromQueue());
        assertEquals(2,busStop.queueSize());
    }
}
