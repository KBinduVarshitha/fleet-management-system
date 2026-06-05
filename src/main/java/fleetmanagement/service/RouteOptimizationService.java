package fleetmanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteOptimizationService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String getDistanceMatrix(String coordinates) {

        String url =
                "https://router.project-osrm.org/table/v1/driving/"
                        + coordinates
                        + "?annotations=distance";

        return restTemplate.getForObject(url, String.class);
    }

    public List<String> optimizeRoute(List<String> stops) {

        List<String> optimizedRoute = new ArrayList<>();

        if (stops == null || stops.isEmpty()) {
            return optimizedRoute;
        }

        boolean[] visited = new boolean[stops.size()];

        int current = 0;

        optimizedRoute.add(stops.get(current));
        visited[current] = true;

        for (int count = 1; count < stops.size(); count++) {

            int nearestIndex = -1;
            double shortestDistance = Double.MAX_VALUE;

            for (int i = 0; i < stops.size(); i++) {

                if (!visited[i]) {

                    double distance =
                            calculateDistance(
                                    stops.get(current),
                                    stops.get(i));

                    if (distance < shortestDistance) {
                        shortestDistance = distance;
                        nearestIndex = i;
                    }
                }
            }

            current = nearestIndex;
            visited[current] = true;
            optimizedRoute.add(stops.get(current));
        }

        return optimizedRoute;
    }

    private double calculateDistance(String point1, String point2) {

        String[] p1 = point1.split(",");
        String[] p2 = point2.split(",");

        double lon1 = Double.parseDouble(p1[0]);
        double lat1 = Double.parseDouble(p1[1]);

        double lon2 = Double.parseDouble(p2[0]);
        double lat2 = Double.parseDouble(p2[1]);

        return Math.sqrt(
                Math.pow(lat2 - lat1, 2)
                        + Math.pow(lon2 - lon1, 2));
    }
}