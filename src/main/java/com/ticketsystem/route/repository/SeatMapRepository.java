package com.ticketsystem.route.repository;

import com.ticketsystem.route.domain.SeatMap;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the SeatMap entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SeatMapRepository extends JpaRepository<SeatMap, Long>, JpaSpecificationExecutor<SeatMap> {}
