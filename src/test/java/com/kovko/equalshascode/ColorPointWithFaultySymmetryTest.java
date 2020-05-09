package com.kovko.equalshascode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: eukovko
 * Date: 5/1/2020
 */
@DisplayName("Test equals with faulty implementation")
class ColorPointWithFaultySymmetryTest {

    @Test
    @DisplayName("Equals symmetry test")
    void testSymmetry() {
        var point = new Point(4, 2);
        var colorPoint = new ColorPointWithFaultySymmetry(4, 2, "red");

        assertAll(
                "Equals is not faulty (suкprisingly)",
                () -> assertThat(point).isEqualTo(colorPoint),
                () -> assertThat(colorPoint).isNotEqualTo(point)
        );

    }
}