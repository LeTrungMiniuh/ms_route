package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Attendant;
import com.ticketsystem.route.service.dto.AttendantDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Attendant} and its DTO {@link AttendantDTO}.
 */
@Mapper(componentModel = "spring")
public interface AttendantMapper extends EntityMapper<AttendantDTO, Attendant> {}
