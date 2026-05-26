package fleetmanagement.controller;

import fleetmanagement.service.RouteOptimizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/optimize-route")
public class RouteOptimizationController {

    @Autowired
    private RouteOptimizationService optimizationService;

    @PostMapping
    public List<String> optimizeRoute(@RequestBody List<String> locations) {

        return optimizationService.optimizeRoute(locations);
    }
}