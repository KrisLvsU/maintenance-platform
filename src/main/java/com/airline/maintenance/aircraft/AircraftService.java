package com.airline.maintenance.aircraft;

import com.airline.maintenance.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AircraftService {

    private final AircraftRepository aircraftRepository;

    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    @Transactional
    public AircraftResponse create(AircraftRequest request) {

        Aircraft aircraft = new Aircraft();

        aircraft.setRegistrationNumber(request.getRegistrationNumber());
        aircraft.setManufacturer(request.getManufacturer());
        aircraft.setModel(request.getModel());
        aircraft.setStatus(request.getStatus());
        aircraft.setCreatedAt(LocalDateTime.now());

        Aircraft savedAircraft = aircraftRepository.save(aircraft);

        return new AircraftResponse(
                savedAircraft.getId(),
                savedAircraft.getRegistrationNumber(),
                savedAircraft.getManufacturer(),
                savedAircraft.getModel(),
                savedAircraft.getStatus(),
                savedAircraft.getCreatedAt()
        );
    }

    public List<AircraftResponse> findAll() {

        return aircraftRepository.findAll()
                .stream()
                .map(aircraft -> new AircraftResponse(
                        aircraft.getId(),
                        aircraft.getRegistrationNumber(),
                        aircraft.getManufacturer(),
                        aircraft.getModel(),
                        aircraft.getStatus(),
                        aircraft.getCreatedAt()
                ))
                .toList();
    }

    public AircraftResponse findById(Long id) {

        Aircraft aircraft = aircraftRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Aircraft with id " + id + " not found"
                        ));

        return new AircraftResponse(
                aircraft.getId(),
                aircraft.getRegistrationNumber(),
                aircraft.getManufacturer(),
                aircraft.getModel(),
                aircraft.getStatus(),
                aircraft.getCreatedAt()
        );
    }


}