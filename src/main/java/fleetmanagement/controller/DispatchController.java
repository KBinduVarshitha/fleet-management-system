package fleetmanagement.controller;

import fleetmanagement.dto.DispatchRequest;
import fleetmanagement.entity.Route;
import fleetmanagement.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dispatch")
public class DispatchController {

    @Autowired
    private DispatchService dispatchService;

    @PostMapping
    public Route assignManifest(
            @RequestBody DispatchRequest request) {

        return dispatchService.assignManifest(request);
    }
}