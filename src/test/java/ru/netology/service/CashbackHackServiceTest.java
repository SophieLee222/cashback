package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashbackIfLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashbackIfMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashbackIfEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}
