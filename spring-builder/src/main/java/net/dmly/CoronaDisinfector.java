package net.dmly;

public class CoronaDisinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

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
