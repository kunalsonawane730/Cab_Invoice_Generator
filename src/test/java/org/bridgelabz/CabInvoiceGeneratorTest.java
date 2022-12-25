package org.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        double distance = 0.1;
        int time = 1;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(invoiceSummary, expectedInvoiceSummary);
    }
    @Test
    public void givenUserId_ShouldReturnInvoiceSummary() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        cabInvoiceGenerator.userRideRepository.put("User001", Arrays.asList(rides));
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFare("User001");
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(invoiceSummary, expectedInvoiceSummary);
    }
}
