package org.bridgelabz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CabInvoiceGenerator {
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final int MIN_FARE = 5;
    public Map<String, List<Ride>> userRideRepository = new HashMap<>();
    /**
     * Creating calculateFare to calculate the fare for the given distance and time
     * @param distance - double distance
     * @param time - int time
     * @return total fare
     */
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MIN_FARE);
    }

    /**
     * This method is created to find the totalFare for given multiple rides
     * @param rides an array of Rides
     * @return InvoiceSummary
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
    /**
     * This method is created to find the totalFare for given multiple rides
     * @param userId given user Id
     * @return InvoiceSummary
     */
    public InvoiceSummary calculateFare(String userId) {
        List<Ride> rides = this.userRideRepository.get(userId);
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return new InvoiceSummary(rides.size(), totalFare);
    }

    /**
     * Main method to print Welcome message
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to CabInvoiceGenerator Application!");
    }
}
