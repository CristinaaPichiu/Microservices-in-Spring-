package com.ordersystem.inventory_service.service;

import com.ordersystem.inventory_service.model.InventoryItem;
import com.ordersystem.inventory_service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<InventoryItem> getAllItems() {
        return inventoryRepository.findAll();
    }

    public InventoryItem getItemById(UUID id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public InventoryItem createItem(InventoryItem item) {
        return inventoryRepository.save(item);
    }

    public void deleteItem(UUID id) {
        inventoryRepository.deleteById(id);
    }
}
