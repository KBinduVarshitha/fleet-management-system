package fleetmanagement.repository;

import fleetmanagement.entity.DeliveryTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryTaskRepository extends JpaRepository<DeliveryTask, Long> {
}