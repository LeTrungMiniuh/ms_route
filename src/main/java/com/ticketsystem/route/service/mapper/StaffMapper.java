package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Staff;
import com.ticketsystem.route.service.dto.StaffDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Staff} and its DTO {@link StaffDTO}.
 */
@Mapper(componentModel = "spring")
public interface StaffMapper extends EntityMapper<StaffDTO, Staff> {}
