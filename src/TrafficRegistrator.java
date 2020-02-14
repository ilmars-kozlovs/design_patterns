public class TrafficRegistrator implements Observer {

    @Override
    public void update(DriveObservable vehicle) {
        System.out.println("Vehicle of " + vehicle + " has started to drive.");
    }
}
