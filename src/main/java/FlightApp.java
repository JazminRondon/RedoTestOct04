import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class FlightApp {
    public static void printAmountForEachThingThatIsPayable(Payable[] payables) {
        for (int i = 0; i < payables.length; i++) {
            payables[i].printPaymentAmount();
        }
    }
        public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs){
            for (int i = 0; i < flightCrewJobs.size(); i++) {
                System.out.println(flightCrewJobs.get(i));
            }
        }
        public static void sortPrintEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs) {
            Collections.sort(flightCrewJobs, new SortArrayList());
            for (FlightCrewJob flightCrewJob : flightCrewJobs) {
                System.out.println(flightCrewJob.toString());
            }
        }
            public static void printAllFlightCrewJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs, CrewMember crewMember) {
                for (FlightCrewJob flightCrewJob : flightCrewJobs) {
                    if (flightCrewJob != crewMember.getJob()) {
                        System.out.println(flightCrewJob);
                    }
                }
            }

        }



