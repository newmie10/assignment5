import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CarTests {
    @Test
    public void testConstructor() {
        Car newCar = new Car(3, 2, 403.4f);
        assertEquals(newCar.id, 3);
        assertEquals(newCar.powerSource, 2);
        assertEquals(newCar.pricePerDay, 403.4f, 0.01f);
    }
    
    @Test
    public void testGetId() {
        Car newCar = new Car(3, 0, 0);
        assertEquals(newCar.getId(), 3);
    }

    @Test
    public void testSetId() {
        Car newCar = new Car(3, 0, 0);
        newCar.setId(2);
        assertEquals(newCar.id, 2);
    }

    @Test
    public void testGetPowerSource() {
        Car newCar = new Car(0, 2, 0);
        assertEquals(newCar.getPowerSource(), 2);
    }

    @Test
    public void testSetPowerSource() {
        Car newCar = new Car(0, 2, 0);
        newCar.setPowerSource(1);
        assertEquals(newCar.powerSource, 1);
    }

    @Test
    public void testGetPricePerDay() {
        Car newCar = new Car(0, 0, 403.4f);
        assertEquals(newCar.getPricePerDay(), 403.4, 0.01f);
    }

    @Test
    public void testSetPricePerDay() {
        Car newCar = new Car(0, 0, 403.4f);
        newCar.setPricePerDay(43.29f);
        assertEquals(newCar.getPricePerDay(), 43.29f, 0.01f);
    }
}


// Constructor Car(int id, int powerSource, float pricePerDay) 1 point
// ◦ getId() → int 1 point
// ◦ setId(int) 1 point
// ◦ getPowerSource() → int 1 point
// ◦ setPowerSource(int) 1 point
// ◦ getPricePerDay() → float 1 point
// ◦ setPricePerDay(float)