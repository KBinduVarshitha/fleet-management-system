package fleetmanagement.controller;

import fleetmanagement.entity.DeliveryTask;
import fleetmanagement.service.DeliveryTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class DeliveryTaskController {

    @Autowired
    private DeliveryTaskService deliveryTaskService;

    @GetMapping
    public List<DeliveryTask> getAllTasks() {
        return deliveryTaskService.getAllTasks();
    }

    @PostMapping
    public DeliveryTask addTask(@RequestBody DeliveryTask task) {
        return deliveryTaskService.saveTask(task);
    }
}