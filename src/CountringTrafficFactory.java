public class CountringTrafficFactory extends AbstractTrafficFactory {
    @Override
    public Drivable createBus() {
        return new TrafficParticipantCounter(new Bus());
    }

    @Override
    public Drivable createCar() {
        return new TrafficParticipantCounter(new Car());
    }

    @Override
    public Drivable createBike() {
        return new TrafficParticipantCounter(new Bike());
    }

    @Override
    public Drivable createMinivan() {
        return new TrafficParticipantCounter(new Minivan());
    }
}
