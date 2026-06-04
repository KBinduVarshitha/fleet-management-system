package fleetmanagement.controller;

import fleetmanagement.entity.Route;
import fleetmanagement.service.RouteOptimizationService;
import fleetmanagement.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @Autowired
    private RouteOptimizationService routeOptimizationService;

    // Get all routes
    @GetMapping
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    // Add new route
    @PostMapping
    public Route addRoute(@RequestBody Route route) {
        return routeService.saveRoute(route);
    }

    // Get distance matrix from OSRM API
    @GetMapping("/distance")
    public String getDistanceMatrix(@RequestParam String coordinates) {
        return routeOptimizationService.getDistanceMatrix(coordinates);
    }

    // Optimize delivery stops
    @PostMapping("/optimize")
    public List<String> optimizeRoute(@RequestBody List<String> stops) {
        return routeOptimizationService.optimizeRoute(stops);
    }
}