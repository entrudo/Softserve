package com.softserve.edu.firsthomework.task2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2Test {

    @Test
    public void calculateAreaOfEnvelopeWithCorrectDateTest() {
        double sideA = 12;
        double sideB = 12;
        double expected;
        Envelope envelope = new Envelope("12", "12");
        envelope.calculateAreaOfEnvelope();
        double actual;

        expected = sideA * sideB;
        actual = envelope.getAreaOfEnvelope();

        Assert.assertEquals(actual, expected, 0.00001);
    }

    @Test
    public void calculateAreaOfEnvelopeWithNullDateTest() {
        double sideA = 0;
        double sideB = 0;
        double expected;
        Envelope envelope = new Envelope("12", "12");
        envelope.calculateAreaOfEnvelope();
        double actual;

        expected = sideA * sideB;
        actual = envelope.getAreaOfEnvelope();

        Assert.assertNotEquals(actual, expected, 0.00001);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void calculateAreaOfEnvelopeWithNegativeSideADateTest() {
        Envelope envelope = new Envelope("-12", "12");
    }

}
