package fleetmanagement.service;

import fleetmanagement.entity.DeliveryStatus;
import fleetmanagement.entity.DeliveryTask;
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
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setStatus(status);

        return deliveryTaskRepository.save(task);
    }
}