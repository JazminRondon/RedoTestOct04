public class CrewMember extends Person {

    private FlightCrewJob job;
    private float salary;

    enum FlightCrewJob{
        PILOT,
        CO_PILOT,
        FLIGHT_ATTENDANT
    }
    FlightCrewJob flightCrewJob1=FlightCrewJob.PILOT;
    FlightCrewJob flightCrewJob2=FlightCrewJob.CO_PILOT;
    FlightCrewJob flightCrewJob3=FlightCrewJob.FLIGHT_ATTENDANT;

    public CrewMember(String person) {

        super(person);
    }
    public CrewMember(String person, FlightCrewJob FlightCrewJob){
        super(person);
        this.job=FlightCrewJob;

    }


    @Override
    public String toString() {
        return "CrewMember{" +
                "job=" + job +
                ", salary=" + salary +
                '}';
    }
}
