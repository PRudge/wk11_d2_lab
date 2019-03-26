import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person passenger;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus();
        busStop = new BusStop("Princes Street");
    }

    @Test
    public void hasNoPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(53, bus.returnCapacity());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());

    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(3, bus.passengerCount());

        bus.removePassenger();
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canMovePassengerFromBustStopToBus(){
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        assertEquals(0,bus.passengerCount());
        bus.addPassenger(busStop.removePassengerFromQueue());
        assertEquals(1,bus.passengerCount());
    }





}
