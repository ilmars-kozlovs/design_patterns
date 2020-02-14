public class Minivan implements Drivable {
    Observable observable;

    public Minivan(){
        observable = new Observable(this);
    }


    @Override
    public void drive() {
        System.out.println("Driving a minivan...");
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
        return Minivan.class.toString();
    }
}
