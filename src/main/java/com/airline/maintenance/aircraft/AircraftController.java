package com.airline.maintenance.aircraft;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {

    private final AircraftService aircraftService;

    public AircraftController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AircraftResponse create(
            @Valid @RequestBody AircraftRequest request) {

        return aircraftService.create(request);
    }

    @GetMapping
    public List<AircraftResponse> findAll() {
        return aircraftService.findAll();
    }

    @GetMapping("/{id}")
    public AircraftResponse findById(@PathVariable Long id) {
        return aircraftService.findById(id);
    }

}