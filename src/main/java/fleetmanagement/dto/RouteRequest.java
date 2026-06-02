package fleetmanagement.dto;

import java.util.List;

public class RouteRequest {

    private List<String> coordinates;

    public List<String> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<String> coordinates) {
        this.coordinates = coordinates;
    }
}