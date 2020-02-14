public interface DriveObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
