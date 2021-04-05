
package ru.netology.stats;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatisticServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatisticService service = new StatisticService();

    @Test
    @org.junit.jupiter.api.Test

    void shouldReturnMax() {
        assertEquals(180, service.sum(sales));
    }

    @Test
    @org.junit.jupiter.api.Test
    void shouldReturnAvg() {

        assertEquals(15, service.avg(sales));
    }

    @Test
    @org.junit.jupiter.api.Test
    void shouldReturnMonthNumberWithMax() {

        assertEquals(8, service.NumberWithMax(sales));
    }

    @Test
    @org.junit.jupiter.api.Test
    void shouldReturnMonthNumberWithMin() {

        assertEquals(9, service.NumberWithMin(sales));
    }

    @Test
    @org.junit.jupiter.api.Test
    void shouldReturnCountLessThanAvg() {

        assertEquals(5, service.lessThanAvg(sales));
    }

    @Test
    @org.junit.jupiter.api.Test
    void shouldReturnCountMoreThanAvg() {

        assertEquals(5, service.moreThanAvg(sales));
    }
}
