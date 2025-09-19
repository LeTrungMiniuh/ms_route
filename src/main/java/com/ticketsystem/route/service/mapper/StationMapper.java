package com.ticketsystem.route.service.mapper;

import com.ticketsystem.route.domain.Address;
import com.ticketsystem.route.domain.Station;
import com.ticketsystem.route.service.dto.AddressDTO;
import com.ticketsystem.route.service.dto.StationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Station} and its DTO {@link StationDTO}.
 */
@Mapper(componentModel = "spring")
public interface StationMapper extends EntityMapper<StationDTO, Station> {
    @Mapping(target = "address", source = "address", qualifiedByName = "addressId")
    StationDTO toDto(Station s);

    @Named("addressId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AddressDTO toDtoAddressId(Address address);
}
