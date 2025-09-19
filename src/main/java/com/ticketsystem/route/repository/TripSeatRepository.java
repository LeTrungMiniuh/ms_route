package com.ticketsystem.route.repository;

import com.ticketsystem.route.domain.TripSeat;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the TripSeat entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TripSeatRepository extends JpaRepository<TripSeat, Long>, JpaSpecificationExecutor<TripSeat> {}
