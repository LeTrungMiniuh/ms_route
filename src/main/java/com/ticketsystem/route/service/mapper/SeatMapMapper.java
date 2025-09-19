package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.SeatMap;
import com.ticketsystem.route.service.dto.SeatMapDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link SeatMap} and its DTO {@link SeatMapDTO}.
 */
@Mapper(componentModel = "spring")
public interface SeatMapMapper extends EntityMapper<SeatMapDTO, SeatMap> {}
