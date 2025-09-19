package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Floor;
import com.ticketsystem.route.domain.SeatMap;
import com.ticketsystem.route.service.dto.FloorDTO;
import com.ticketsystem.route.service.dto.SeatMapDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Floor} and its DTO {@link FloorDTO}.
 */
@Mapper(componentModel = "spring")
public interface FloorMapper extends EntityMapper<FloorDTO, Floor> {
    @Mapping(target = "seatMap", source = "seatMap", qualifiedByName = "seatMapId")
    FloorDTO toDto(Floor s);

    @Named("seatMapId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    SeatMapDTO toDtoSeatMapId(SeatMap seatMap);
}
