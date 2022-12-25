package org.bridgelabz;

public class Ride {
    private double distance;
    private int time;
    /**
     * to accept myultiple rides
     * @param distance
     * @param time
     */
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }
    public double getDistance() {
        return distance;
    }
    public int getTime() {
        return time;
    }
}
