package fleetmanagement.controller;

import fleetmanagement.entity.Vehicle;
import fleetmanagement.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable Long id, @RequestBody Vehicle updatedVehicle) {

        Vehicle vehicle = vehicleService.getVehicleById(id);

        vehicle.setVehicleNumber(updatedVehicle.getVehicleNumber());
        vehicle.setCapacity(updatedVehicle.getCapacity());
        vehicle.setVehicleType(updatedVehicle.getVehicleType());
        vehicle.setStatus(updatedVehicle.getStatus());

        return vehicleService.saveVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    public String deleteVehicle(@PathVariable Long id) {

        vehicleService.deleteVehicle(id);

        return "Vehicle deleted successfully";
    }
}