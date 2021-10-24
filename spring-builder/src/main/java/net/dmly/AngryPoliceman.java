package net.dmly;

public class AngryPoliceman implements Policeman {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("You will be killed");
    }
}
