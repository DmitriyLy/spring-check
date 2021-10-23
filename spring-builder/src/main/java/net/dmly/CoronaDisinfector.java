package net.dmly;

public class CoronaDisinfector {
    public void start(Room room) {
        disinfect(room);
    }

    private void disinfect(Room room) {
        System.out.println("Disinfection in progress.....");
    }
}
