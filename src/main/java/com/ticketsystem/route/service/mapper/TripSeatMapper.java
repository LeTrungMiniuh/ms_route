package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Trip;
import com.ticketsystem.route.domain.TripSeat;
import com.ticketsystem.route.service.dto.TripDTO;
import com.ticketsystem.route.service.dto.TripSeatDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TripSeat} and its DTO {@link TripSeatDTO}.
 */
@Mapper(componentModel = "spring")
public interface TripSeatMapper extends EntityMapper<TripSeatDTO, TripSeat> {
    @Mapping(target = "trip", source = "trip", qualifiedByName = "tripId")
    TripSeatDTO toDto(TripSeat s);

    @Named("tripId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TripDTO toDtoTripId(Trip trip);
}
