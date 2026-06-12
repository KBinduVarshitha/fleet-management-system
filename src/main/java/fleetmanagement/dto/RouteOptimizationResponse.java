// package fleetmanagement.dto;

// import java.util.List;

// public class RouteRequest {

//     private List<String> coordinates;

//     public List<String> getCoordinates() {
//         return coordinates;
//     }

//     public void setCoordinates(List<String> coordinates) {
//         this.coordinates = coordinates;
//     }
// }

package fleetmanagement.dto;

import java.util.List;

public class RouteOptimizationResponse {

    private String message;
    private String algorithm;
    private List<String> optimizedRoute;

    public RouteOptimizationResponse() {
    }

    public RouteOptimizationResponse(String message, String algorithm, List<String> optimizedRoute) {
        this.message = message;
        this.algorithm = algorithm;
        this.optimizedRoute = optimizedRoute;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public List<String> getOptimizedRoute() {
        return optimizedRoute;
    }

    public void setOptimizedRoute(List<String> optimizedRoute) {
        this.optimizedRoute = optimizedRoute;
    }
}