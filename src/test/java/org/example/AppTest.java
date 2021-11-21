package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{

    @Test
    public void isLeapYearsYearDivisibleBy400ShouldReturnTrue() {
        int year = 2000;
        LeapYears leapYears = new LeapYears();
        boolean isLeapYears = leapYears.isLeapYears(year);
        Assert.assertTrue(isLeapYears);
    }

    @Test
    public void isLeapYearsYearDivisibleBy100ButNotBy400ShouldReturnFalse() {
        int year = 1900;
        LeapYears leapYears = new LeapYears();
        boolean isLeapYears = leapYears.isLeapYears(year);
        Assert.assertFalse(isLeapYears);
    }

    @Test
    public void isLeapYearsYearDivisibleBy4ButNotBy100ShouldReturnTrue() {
        int year = 1960;
        LeapYears leapYears = new LeapYears();
        boolean isLeapYears = leapYears.isLeapYears(year);
        Assert.assertTrue(isLeapYears);
    }

    @Test
    public void isLeapYearsYearNotDivisibleBy4ShouldReturnFalse() {
        int year = 2019;
        LeapYears leapYears = new LeapYears();
        boolean isLeapYears = leapYears.isLeapYears(year);
        Assert.assertFalse(isLeapYears);
    }
}
