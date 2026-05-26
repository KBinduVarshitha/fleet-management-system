package fleetmanagement.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RouteOptimizationService {

    public List<String> optimizeRoute(List<String> locations) {

        List<String> optimizedRoute = new ArrayList<>(locations);

        Collections.sort(optimizedRoute);

        return optimizedRoute;
    }
}