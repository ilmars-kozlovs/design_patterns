public class Bike implements Drivable {
    Observable observable;

    public Bike(){
        observable = new Observable(this);
    }


    @Override
    public void drive() {
        System.out.println("Riding a bike...");
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
