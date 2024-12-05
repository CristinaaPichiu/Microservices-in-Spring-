package com.ordersystem.inventory_service.repository;

import com.ordersystem.inventory_service.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface InventoryRepository extends JpaRepository<InventoryItem, UUID> {
}
