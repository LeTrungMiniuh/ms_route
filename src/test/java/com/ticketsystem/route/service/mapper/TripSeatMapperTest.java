package com.ticketsystem.route.service.mapper;

import static com.ticketsystem.route.domain.TripSeatAsserts.*;
import static com.ticketsystem.route.domain.TripSeatTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TripSeatMapperTest {

    private TripSeatMapper tripSeatMapper;

    @BeforeEach
    void setUp() {
        tripSeatMapper = new TripSeatMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getTripSeatSample1();
        var actual = tripSeatMapper.toEntity(tripSeatMapper.toDto(expected));
        assertTripSeatAllPropertiesEquals(expected, actual);
    }
}
