import java.util.ArrayList;
import java.util.Iterator;

public class TrafficCity implements Drivable {
    ArrayList vehicles = new ArrayList();

    public void add(Drivable vehicle){
        vehicles.add(vehicle);
    }

    @Override
    public void drive() {
        Iterator iterator = vehicles.iterator();
        while (iterator.hasNext()){
            Drivable drivable = (Drivable) iterator.next();
            drivable.drive();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            Drivable driver = (Drivable) iterator.next();
            driver.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
