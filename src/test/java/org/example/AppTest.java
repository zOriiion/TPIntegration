package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

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

    @Test
    public void isTataYoyoIntUnder1ShouldReturnNombreInvalide() {

        int i = -5;
        String expected = "Nombre invalide";
        TataYoyo tataYoyo = new TataYoyo();

        String actual = tataYoyo.tataYoyo(i);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTataYoyoIntUpper50ShouldReturnNombreInvalide() {

        int i = 72;
        String expected = "Nombre invalide";
        TataYoyo tataYoyo = new TataYoyo();

        String actual = tataYoyo.tataYoyo(i);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTataYoyoDivisibleBy3And5ShouldReturnTataYoyo(){

        int i = 15;
        String expected = "Tata Yoyo";
        TataYoyo tataYoyo = new TataYoyo();

        String actual = tataYoyo.tataYoyo(i);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTataYoyoDivisibleBy3ButNotBy5ShouldReturnTata(){

        int i = 9;
        String expected = "Tata";
        TataYoyo tataYoyo = new TataYoyo();

        String actual = tataYoyo.tataYoyo(i);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTataYoyoDivisibleBy5ButNotBy3ShouldReturnTata(){

        int i = 10;
        String expected = "Yoyo";
        TataYoyo tataYoyo = new TataYoyo();

        String actual = tataYoyo.tataYoyo(i);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTataYoyoNotDivisibleBy3And5ShouldReturnTata(){

        int i = 10;
        String expected = "Yoy";
        TataYoyo tataYoyo = new TataYoyo();

        String actual = tataYoyo.tataYoyo(i);

        Assert.assertEquals(expected, actual);
    }
}
