package com.lorcan.warehouse.service;

import com.lorcan.warehouse.dto.WarehouseInventoryDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class InventoryService {

    // Mocked inventory data
    private final List<WarehouseInventoryDto> inventoryList = Arrays.asList(
            new WarehouseInventoryDto(1L,  100),
            new WarehouseInventoryDto(2L, 50),
            new WarehouseInventoryDto(3L, 200),
            new WarehouseInventoryDto(4L, 30)
    );

    // Method to fetch all inventory data
    public List<WarehouseInventoryDto> getAllInventory() {
        return inventoryList;
    }
}