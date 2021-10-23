package net.dmly;

public class CoronaDisinfector {

    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

    public void start(Room room) {
        announcer.announce("Disinfenction is starting, get out everyone!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Disinfenction done.");
    }

    private void disinfect(Room room) {
        System.out.println("Disinfection in progress.....");
    }
}
