public class TrafficParticipantCounter implements Drivable {
    Drivable participant;
    static int participantCount;

    public TrafficParticipantCounter(Drivable participant){
        this.participant = participant;
    }

    public void drive(){
        participant.drive();
        participantCount ++;
    }

    public static int getParticipantCount(){
        return participantCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        participant.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        participant.notifyObservers();
    }
}
