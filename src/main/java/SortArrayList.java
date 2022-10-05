import java.util.Comparator;

public class SortArrayList implements Comparator<FlightCrewJob> {
    @Override
    public int compare(FlightCrewJob flightCrewJob1, FlightCrewJob flightCrewJob2) {
        if (flightCrewJob1.toString().length() > flightCrewJob2.toString().length()) {
            return 1;
        }
        return -1;
    }
}