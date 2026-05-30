package fleetmanagement.service;

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
} 