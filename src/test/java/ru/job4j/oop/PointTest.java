package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        first.distance(second);
        assertThat(first.distance(second)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10toMinus20then2() {
        double expected = 1;
        Point first = new Point(-1, 0);
        Point second = new Point(-2, 0);
        first.distance(second);
        assertThat(first.distance(second)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when46to810then5Dot66() {
        double expected = 5.66;
        Point first = new Point(4, 6);
        Point second = new Point(8, 10);
        first.distance(second);
        assertThat(first.distance(second)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when111to222then1Dot73() {
        double expected = 1.73;
        Point first = new Point(1, 1, 1);
        Point second = new Point(2, 2, 2);
        first.distance3d(second);
        assertThat(first.distance3d(second)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123to789then10Dot39() {
        double expected = 10.39;
        Point first = new Point(1, 2, 3);
        Point second = new Point(7, 8, 9);
        first.distance3d(second);
        assertThat(first.distance3d(second)).isEqualTo(expected, withPrecision(0.01));
    }

}