import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements DriveObservable {
    ArrayList observers = new ArrayList();
    DriveObservable drive;

    public Observable(DriveObservable drive) {
        this.drive = drive;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(drive);
        }
    }
}
