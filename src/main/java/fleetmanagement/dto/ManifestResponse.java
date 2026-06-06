package fleetmanagement.dto;

import fleetmanagement.entity.Driver;
import fleetmanagement.entity.Route;
import fleetmanagement.entity.Vehicle;

public class ManifestResponse {

    private Driver driver;
    private Vehicle vehicle;
    private Route route;

    public ManifestResponse() {
    }

    public ManifestResponse(Driver driver, Vehicle vehicle, Route route) {
        this.driver = driver;
        this.vehicle = vehicle;
        this.route = route;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}