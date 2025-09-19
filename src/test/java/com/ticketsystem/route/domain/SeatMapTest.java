package com.ticketsystem.route.domain;

import static com.ticketsystem.route.domain.SeatMapTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.ticketsystem.route.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class SeatMapTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(SeatMap.class);
        SeatMap seatMap1 = getSeatMapSample1();
        SeatMap seatMap2 = new SeatMap();
        assertThat(seatMap1).isNotEqualTo(seatMap2);

        seatMap2.setId(seatMap1.getId());
        assertThat(seatMap1).isEqualTo(seatMap2);

        seatMap2 = getSeatMapSample2();
        assertThat(seatMap1).isNotEqualTo(seatMap2);
    }
}
