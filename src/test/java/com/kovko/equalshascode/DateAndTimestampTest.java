package com.kovko.equalshascode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Author: eukovko
 * Date: 5/9/2020
 */
@DisplayName("Testing faulty equals implementation in Timestamp class (added nanoseconds)")
public class DateAndTimestampTest {

    Date date;
    Timestamp timestamp;

    @BeforeEach
    void setUp() {
        date = new Date();
        timestamp = new Timestamp(date.getTime());
    }

    @Test
    @DisplayName("Date is not equal to a timestamp (will fail instance of check)")
    void testDateToTimestampEquality() {

        assertAll(
                ()->assertThat(timestamp).isNotEqualTo(date),
                ()->assertThat(timestamp.getTime()).isEqualTo(date.getTime())
        );
    }

    @Test
    @DisplayName("Timestamp is equal to date")
    void testTimestampToDateEquality() {

        assertAll(
                ()->assertThat(date).isEqualTo(timestamp),
                ()->assertThat(timestamp.getTime()).isEqualTo(date.getTime())
        );
    }
}
