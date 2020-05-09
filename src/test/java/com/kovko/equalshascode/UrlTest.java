package com.kovko.equalshascode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Author: eukovko
 * Date: 5/9/2020
 */
@DisplayName("Uri class equality testing")
public class UrlTest {

    URL urlA;
    URL urlB;

    @BeforeEach
    void setUp() throws MalformedURLException {
        urlA = new URL("https://www.google.com/");
        urlB = new URL("https://www.google.com/");
    }

    @Test
    void testUrlEquality(){
        // TODO: 5/9/2020 Check URLStreamHandler equals implementation
        assertThat(urlA).isEqualTo(urlB);
    }
}
