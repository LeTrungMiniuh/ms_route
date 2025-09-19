package com.ticketsystem.route.domain;

import static com.ticketsystem.route.domain.DriverTestSamples.*;
import static com.ticketsystem.route.domain.TripTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.ticketsystem.route.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class DriverTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Driver.class);
        Driver driver1 = getDriverSample1();
        Driver driver2 = new Driver();
        assertThat(driver1).isNotEqualTo(driver2);

        driver2.setId(driver1.getId());
        assertThat(driver1).isEqualTo(driver2);

        driver2 = getDriverSample2();
        assertThat(driver1).isNotEqualTo(driver2);
    }

    @Test
    void tripTest() {
        Driver driver = getDriverRandomSampleGenerator();
        Trip tripBack = getTripRandomSampleGenerator();

        driver.setTrip(tripBack);
        assertThat(driver.getTrip()).isEqualTo(tripBack);
        assertThat(tripBack.getDriver()).isEqualTo(driver);

        driver.trip(null);
        assertThat(driver.getTrip()).isNull();
        assertThat(tripBack.getDriver()).isNull();
    }
}
