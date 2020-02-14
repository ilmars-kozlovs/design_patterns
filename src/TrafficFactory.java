public class TrafficFactory extends AbstractTrafficFactory {

    @Override
    public Drivable createBus() {
        return new Bus();
    }

    @Override
    public Drivable createCar() {
        return new Car();
    }

    @Override
    public Drivable createBike() {
        return new Bike();
    }

    @Override
    public Drivable createMinivan() {
        return new Minivan();
    }
}
