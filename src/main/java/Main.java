public class Main {

    String[] luggage = {"1","2"};
    CrewMember crewMember1 = new CrewMember("Memeber 1", CrewMember.FlightCrewJob.PILOT);
    CrewMember crewMember2 = new CrewMember("Member 2", CrewMember.FlightCrewJob.CO_PILOT);
    CrewMember crewMember3 = new CrewMember("Memeber 3", CrewMember.FlightCrewJob.FLIGHT_ATTENDANT);

    PlaneTicket planeTicket=new PlaneTicket(01,"JFK","LAX","C12",540.0);
    BusTicket busTicket=new BusTicket(33,"DC","NY","B202",187.0);

    Passenger passenger57=new Passenger("Passenger57",planeTicket,900.0,"");
    Passenger passenger07=new Passenger("Passenger07",planeTicket,2000.0,"2");



}