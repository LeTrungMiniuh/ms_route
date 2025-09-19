package com.ticketsystem.route.repository;

import com.ticketsystem.route.domain.Attendant;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Attendant entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AttendantRepository extends JpaRepository<Attendant, Long>, JpaSpecificationExecutor<Attendant> {}
