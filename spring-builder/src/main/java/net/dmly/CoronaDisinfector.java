package net.dmly;

@Deprecated
public class CoronaDisinfector {

    @InjectByType
    private Announcer announcer;

    @InjectByType
    private Policeman policeman;

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
