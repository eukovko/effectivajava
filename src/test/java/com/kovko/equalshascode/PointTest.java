package com.kovko.equalshascode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Author: eukovko
 * Date: 5/1/2020
 */
@DisplayName("Point class test")
class PointTest {

    @Test
    @DisplayName("Equals reflexivity test")
    void testReflexivity() {
        Point point = new Point(4, 2);
        assertThat(point).as("Equals is not reflexive").isEqualTo(point);
    }

    @Test
    @DisplayName("Equals symmetry test")
    void testSymmetry() {
        Point pointA = new Point(4, 2);
        Point pointB = new Point(4, 2);
        assertAll(
                "Equals is not symmetric",
                () -> assertThat(pointA).isEqualTo(pointB),
                () -> assertThat(pointB).isEqualTo(pointA)
        );
    }

    @Test
    @DisplayName("Equals transitive test")
    void testTransitivity(){
        Point pointA = new Point(4, 2);
        Point pointB = new Point(4, 2);
        Point pointC = new Point(4, 2);
        assertAll(
                "Equals is not transitive",
                () -> assertThat(pointA).isEqualTo(pointB),
                () -> assertThat(pointB).isEqualTo(pointC),
                () -> assertThat(pointC).isEqualTo(pointA)
        );
    }

    @RepeatedTest(42)
    @DisplayName("Equals consistency test")
    void testConsistency() {
        Point point = new Point(4, 2);
        assertThat(point).as("Equals is not consistent").isEqualTo(point);
    }

    @Test
    @DisplayName("Equals non-nullity test")
    void testNonNullity(){
        Point point = new Point(4, 2);
        assertThat(point).as("Equals is not working with nulls").isNotEqualTo(null);
    }


}