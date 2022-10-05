public class CrewMember extends Person implements ServAble, Payable {

    private FlightCrewJob job;
    private float salary;
    public CrewMember(String person) {

        super(person);
    }
//    public CrewMember(String person, FlightCrewJob FlightCrewJob){
//        super(person);
//        this.job=FlightCrewJob;
//    }
    public CrewMember(String person, FlightCrewJob job, float salary){
        super(person);
        this.job=job;
        this.salary=salary;

    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    @Override
    public void serve(Person person) {
    //    person.getName();
        System.out.println("Serving the passenger"+person.getName());
    }
    public void printPaymentAmount() {
        System.out.println(salary);
    }
    @Override
    public String toString() {
        return "CrewMember{" +
                "job=" + job +
                ", salary=" + salary +
                '}';
    }
}
