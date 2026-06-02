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

    @GetMapping
    public List<Route> getAllRoutes() {
        return routeService.getAllRoutes();
    }

    @PostMapping
    public Route addRoute(@RequestBody Route route) {
        return routeService.saveRoute(route);
    }

    @PostMapping("/optimize")
    public List<String> optimizeRoute(@RequestBody List<String> stops) {
        return routeOptimizationService.optimizeRoute(stops);
    }
}