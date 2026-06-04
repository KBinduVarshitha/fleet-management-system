package fleetmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RouteOptimizationService {

    @Autowired
    private RestTemplate restTemplate;

    public String getDistanceMatrix(String coordinates) {

        String url =
                "https://router.project-osrm.org/table/v1/driving/"
                        + coordinates
                        + "?annotations=distance";

        return restTemplate.getForObject(url, String.class);
    }
    
    public List<String> optimizeRoute(List<String> stops) {

        if (stops == null || stops.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> optimizedRoute = new ArrayList<>();

        optimizedRoute.add(stops.get(0));

        for (int i = 1; i < stops.size(); i++) {
            optimizedRoute.add(stops.get(i));
        }

        return optimizedRoute;
    }
}