public class Bus implements Drivable {
    Observable observable;

    public Bus(){
        observable = new Observable(this);
    }


    @Override
    public void drive() {
        System.out.println("Driving a bus...");
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
        return Bus.class.toString();
    }
}
