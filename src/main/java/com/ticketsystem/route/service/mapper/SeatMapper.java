package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Floor;
import com.ticketsystem.route.domain.Seat;
import com.ticketsystem.route.service.dto.FloorDTO;
import com.ticketsystem.route.service.dto.SeatDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Seat} and its DTO {@link SeatDTO}.
 */
@Mapper(componentModel = "spring")
public interface SeatMapper extends EntityMapper<SeatDTO, Seat> {
    @Mapping(target = "floor", source = "floor", qualifiedByName = "floorId")
    SeatDTO toDto(Seat s);

    @Named("floorId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    FloorDTO toDtoFloorId(Floor floor);
}
