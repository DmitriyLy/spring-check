package net.dmly;

public class PolicemanImpl implements Policeman {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Policeman >> forcing to leave!");
    }
}
