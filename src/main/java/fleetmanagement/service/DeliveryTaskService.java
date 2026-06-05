package fleetmanagement.service;

import fleetmanagement.entity.DeliveryStatus;
import fleetmanagement.entity.DeliveryTask;
import fleetmanagement.exception.ResourceNotFoundException;
import fleetmanagement.repository.DeliveryTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryTaskService {

    @Autowired
    private DeliveryTaskRepository deliveryTaskRepository;

    public List<DeliveryTask> getAllTasks() {
        return deliveryTaskRepository.findAll();
    }

    public DeliveryTask saveTask(DeliveryTask task) {
        return deliveryTaskRepository.save(task);
    }

    public DeliveryTask updateStatus(Long id, DeliveryStatus status) {

        DeliveryTask task = deliveryTaskRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found"));

        DeliveryStatus current = task.getStatus();

        if (current == DeliveryStatus.UNASSIGNED
                && status != DeliveryStatus.DISPATCHED) {

            throw new RuntimeException(
                    "Task must be DISPATCHED first");
        }

        if (current == DeliveryStatus.DISPATCHED
                && status != DeliveryStatus.IN_TRANSIT) {

            throw new RuntimeException(
                    "Task must be IN_TRANSIT next");
        }

        if (current == DeliveryStatus.IN_TRANSIT
                && status != DeliveryStatus.DELIVERED) {

            throw new RuntimeException(
                    "Task must be DELIVERED next");
        }

        task.setStatus(status);

        return deliveryTaskRepository.save(task);
    }
}