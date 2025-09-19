package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Attendant;
import com.ticketsystem.route.domain.Driver;
import com.ticketsystem.route.domain.Route;
import com.ticketsystem.route.domain.Trip;
import com.ticketsystem.route.service.dto.AttendantDTO;
import com.ticketsystem.route.service.dto.DriverDTO;
import com.ticketsystem.route.service.dto.RouteDTO;
import com.ticketsystem.route.service.dto.TripDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Trip} and its DTO {@link TripDTO}.
 */
@Mapper(componentModel = "spring")
public interface TripMapper extends EntityMapper<TripDTO, Trip> {
    @Mapping(target = "driver", source = "driver", qualifiedByName = "driverId")
    @Mapping(target = "attendant", source = "attendant", qualifiedByName = "attendantId")
    @Mapping(target = "route", source = "route", qualifiedByName = "routeId")
    TripDTO toDto(Trip s);

    @Named("driverId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DriverDTO toDtoDriverId(Driver driver);

    @Named("attendantId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AttendantDTO toDtoAttendantId(Attendant attendant);

    @Named("routeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RouteDTO toDtoRouteId(Route route);
}
