import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        FlightCrewJob flightCrewJob1=FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2=FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3=FlightCrewJob.FLIGHT_ATTENDANT;

        CrewMember crewMember1 = new CrewMember("Memeber 1", flightCrewJob1,206589.0f);
        CrewMember crewMember2 = new CrewMember("Member 2", flightCrewJob2,122858.0f);
        CrewMember crewMember3 = new CrewMember("Memeber 3", flightCrewJob3,65178.0f);

        PlaneTicket planeTicket = new PlaneTicket(01, "JFK", "LAX", "C12", 540.0);
        BusTicket busTicket = new BusTicket(33, "DC", "NY", "B202", 187.0);

        Passenger passenger57 = new Passenger("Passenger57", planeTicket, 900.0, new String[]{"carryon", "personal", "checked"});

        Passenger passenger07 = new Passenger("Passenger07", planeTicket, 2000.0, new String[]{"checked", "personal"});
        Payable[] payables={planeTicket,busTicket, crewMember1, crewMember2, crewMember3};
        ArrayList<FlightCrewJob> flightCrewJobs= new ArrayList<>();
        flightCrewJobs.add(flightCrewJob3);
        flightCrewJobs.add(flightCrewJob1);
        flightCrewJobs.add(flightCrewJob2);

        System.out.println(passenger57.getAmtOfLuggage());
        System.out.println("=====================");
        passenger07.printTicket();
        System.out.println("=====================");
        crewMember3.serve(passenger57);
        System.out.println("=====================");
        FlightApp.printAmountForEachThingThatIsPayable(payables);
        System.out.println("=========Before sorting ============");
        FlightApp.printEachFlightCrewJob(flightCrewJobs);
        System.out.println("=======After sorting==============");
        FlightApp.sortPrintEachFlightCrewJob(flightCrewJobs);
        System.out.println("==================");
        FlightApp.printAllFlightCrewJobsExceptThisCrewMemberJob(flightCrewJobs,crewMember2);

    }
}
