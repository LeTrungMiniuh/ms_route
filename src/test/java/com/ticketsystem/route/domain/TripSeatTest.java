package com.ticketsystem.route.domain;

import static com.ticketsystem.route.domain.TripSeatTestSamples.*;
import static com.ticketsystem.route.domain.TripTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.ticketsystem.route.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class TripSeatTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(TripSeat.class);
        TripSeat tripSeat1 = getTripSeatSample1();
        TripSeat tripSeat2 = new TripSeat();
        assertThat(tripSeat1).isNotEqualTo(tripSeat2);

        tripSeat2.setId(tripSeat1.getId());
        assertThat(tripSeat1).isEqualTo(tripSeat2);

        tripSeat2 = getTripSeatSample2();
        assertThat(tripSeat1).isNotEqualTo(tripSeat2);
    }

    @Test
    void tripTest() {
        TripSeat tripSeat = getTripSeatRandomSampleGenerator();
        Trip tripBack = getTripRandomSampleGenerator();

        tripSeat.setTrip(tripBack);
        assertThat(tripSeat.getTrip()).isEqualTo(tripBack);

        tripSeat.trip(null);
        assertThat(tripSeat.getTrip()).isNull();
    }
}
