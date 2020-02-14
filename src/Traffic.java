public class Traffic {

    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        AbstractTrafficFactory trafficFactory = new CountringTrafficFactory();
        traffic.participate(trafficFactory);

    }

    void participate(AbstractTrafficFactory trafficFactory){
        Drivable bus = trafficFactory.createBus();
        Drivable car = trafficFactory.createCar();
        Drivable minivan = trafficFactory.createMinivan();
        Drivable bike = trafficFactory.createBike();

        TrafficCity riga = new TrafficCity();
        riga.add(bus);
        riga.add(car);
        riga.add(minivan);
        riga.add(bike);

        TrafficRegistrator trafficRegistrator = new TrafficRegistrator();
        riga.registerObserver(trafficRegistrator);

        System.out.println("-----Traffic participants-----");

        participate(riga);

        System.out.println("Currently there are " + TrafficParticipantCounter.getParticipantCount() + " participants on the traffic");
    }

    void participate(Drivable transport){
        transport.drive();
    }
}
