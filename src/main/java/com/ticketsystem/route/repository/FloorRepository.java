package com.ticketsystem.route.repository;

import com.ticketsystem.route.domain.Floor;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Floor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FloorRepository extends JpaRepository<Floor, Long>, JpaSpecificationExecutor<Floor> {}
