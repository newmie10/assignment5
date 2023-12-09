import java.util.*;

public class CarLot{
    protected Queue<Car> gasQ;
    protected Queue<Car> electricQ;
    protected Queue<Car> hybridQ;

    public CarLot() {
        this.gasQ = new Queue<Car>();
        this.electricQ = new Queue<Car>();
        this.hybridQ = new Queue<Car>();
    }

    public boolean addCar(Car car) {
        if (car.getPowerSource() == 1) {
            gasQ.enqueue(car);
        } else if (car.getPowerSource() == 3) {
            electricQ.enqueue(car);
        } else if (car.getPowerSource() == 2) {
            hybridQ.enqueue(car);
        } else {
            return false;
        }
        return true;
    }

    public List<Car> processRequests(CarRequests requests) {
        List<Car> cars = new ArrayList<Car>();
        int type;
        while (requests.hasPendingRequests()) {
            type = requests.getRequest();
            if (type == 1) {
                if (!gasQ.isEmpty()) {
                    cars.add(gasQ.dequeue());
                }
                else
                {
                    Car newCar = new Car(0, 1, 0.0f);
                    cars.add(newCar);
                }
            }
            else if (type == 2) {
                if (!hybridQ.isEmpty()) {
                    cars.add(hybridQ.dequeue());
                }
                else
                {
                    Car newCar = new Car(0, 2, 0.0f);
                    cars.add(newCar);
                }
            }
            else if (type == 3) {
                if (!electricQ.isEmpty()) {
                    cars.add(electricQ.dequeue());
                }
                else
                {
                    Car newCar = new Car(0, 3, 0.0f);
                    cars.add(newCar);
                }
            }
        }
        return cars;
    }
}
