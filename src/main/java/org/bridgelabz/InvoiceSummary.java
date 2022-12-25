package org.bridgelabz;
/**
 * This class is created to hold summary of multiple rides
 */
public class InvoiceSummary {
    private final int noOfRides;
    private final double totalFare;
    private final double avgFare;

    /**
     * parameterized constructor to bind the values for noOfRides, totalFare and avgFare
     * @param noOfRides
     * @param totalFare
     */
    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare/this.noOfRides;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return noOfRides == that.noOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgFare, avgFare) == 0;
    }
}
