package com.airline.maintenance.aircraft;

import java.time.LocalDateTime;

public class AircraftResponse {

    private Long id;
    private String registrationNumber;
    private String manufacturer;
    private String model;
    private AircraftStatus status;
    private LocalDateTime createdAt;

    public AircraftResponse() {
    }

    public AircraftResponse(
            Long id,
            String registrationNumber,
            String manufacturer,
            String model,
            AircraftStatus status,
            LocalDateTime createdAt) {

        this.id = id;
        this.registrationNumber = registrationNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public AircraftStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}