package com.airline.maintenance.aircraft;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository
        extends JpaRepository<Aircraft, Long> {
}