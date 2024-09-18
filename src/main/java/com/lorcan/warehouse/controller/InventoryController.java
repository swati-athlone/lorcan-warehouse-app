package com.lorcan.warehouse.controller;

import com.lorcan.warehouse.dto.WarehouseInventoryDto;
import com.lorcan.warehouse.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    // Endpoint to get inventory data
    @GetMapping("/api/inventory")
    public ResponseEntity<List<WarehouseInventoryDto>> getInventory() {
        List<WarehouseInventoryDto> inventory = inventoryService.getAllInventory();
        return ResponseEntity.ok(inventory);
    }
}
