package org.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    double distance = 2.0;
    int time = 5;
    double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
}
}
