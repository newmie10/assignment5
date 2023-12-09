import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.*;

public class CarLotTests {
    @Test
    public void testConstructor() {
        Queue<Car> emptyQueue = new Queue<Car>();
        CarLot newCarLot = new CarLot();
        assertTrue(emptyQueue.getQueue().equals(newCarLot.gasQ.getQueue()));
    }

    @Test
    public void testAddCar() {
        Queue<Car> emptyQueue = new Queue<Car>();
        CarLot newCarLot = new CarLot();
        Car newCar = new Car(3, 1, 0);
        newCarLot.addCar(newCar);
        emptyQueue.enqueue(newCar);
        assertTrue(emptyQueue.getQueue().equals(newCarLot.gasQ.getQueue()));
    }

    @Test
    public void testProcessRequests() {
        CarLot newCarLot = new CarLot();
        Car gasCar = new Car(0, 1, 0);
        Car hybridCar = new Car(1, 2, 0);
        Car electricCar = new Car(2, 3, 0);
        CarRequests newRequests = new CarRequests();
        newRequests.addRequest(2);
        newRequests.addRequest(1);
        newRequests.addRequest(3);
        newCarLot.addCar(electricCar);
        newCarLot.addCar(gasCar);
        newCarLot.addCar(hybridCar);
        List<Car> cars = newCarLot.processRequests(newRequests);
        List<Car> expectedCars = new ArrayList<Car>();
        expectedCars.add(hybridCar);
        expectedCars.add(gasCar);
        expectedCars.add(electricCar);
        if (cars.equals(expectedCars)) {
            assertTrue(true);
        }
        else
        {
            assertTrue(false);
        }
        
    }

}


// ◦ Constructor CarLot() 1 point
// ◦ addCar(Car) → boolean 3 points
// ◦ processRequests(CarRequests) → List 