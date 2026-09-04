package com.airline.maintenance.aircraft;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AircraftRequest {

    @NotBlank
    @Size(max = 20)
    private String registrationNumber;

    @NotBlank
    @Size(max = 50)
    private String manufacturer;

    @NotBlank
    @Size(max = 50)
    private String model;

    @NotNull
    private AircraftStatus status;

    public AircraftRequest() {
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AircraftStatus getStatus() {
        return status;
    }

    public void setStatus(AircraftStatus status) {
        this.status = status;
    }
}