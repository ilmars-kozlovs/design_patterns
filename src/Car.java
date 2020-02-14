public class Car implements Drivable {
    Observable observable;

    public Car(){
        observable = new Observable(this);
    }


    @Override
    public void drive() {
        System.out.println("Driving a car...");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return Car.class.toString();
    }
}
