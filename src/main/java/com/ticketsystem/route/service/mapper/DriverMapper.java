package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Driver;
import com.ticketsystem.route.service.dto.DriverDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Driver} and its DTO {@link DriverDTO}.
 */
@Mapper(componentModel = "spring")
public interface DriverMapper extends EntityMapper<DriverDTO, Driver> {}
