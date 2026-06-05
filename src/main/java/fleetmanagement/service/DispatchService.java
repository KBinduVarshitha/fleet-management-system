package fleetmanagement.service;

import fleetmanagement.dto.DispatchRequest;
import fleetmanagement.entity.Driver;
import fleetmanagement.entity.Route;
import fleetmanagement.entity.Vehicle;
import fleetmanagement.repository.DriverRepository;
import fleetmanagement.repository.RouteRepository;
import fleetmanagement.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fleetmanagement.exception.ResourceNotFoundException;


@Service
public class DispatchService {

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    public Route assignManifest(DispatchRequest request) {

        Route route = routeRepository.findById(request.getRouteId())
                .orElseThrow(() -> new ResourceNotFoundException("Route not found"));

        Driver driver = driverRepository.findById(request.getDriverId())
                .orElseThrow(() -> new ResourceNotFoundException("Driver not found"));

        Vehicle vehicle = vehicleRepository.findById(request.getVehicleId())
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        route.setDriver(driver);
        route.setVehicle(vehicle);

        return routeRepository.save(route);
    }
}