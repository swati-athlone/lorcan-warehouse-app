package com.lorcan.warehouse.dto;

import lombok.Data;

@Data
public class WarehouseInventoryDto {
    private Long productId;
    private int availableQuantity;

    public WarehouseInventoryDto(Long productId, int availableQuantity) {
        this.productId = productId;
        this.availableQuantity = availableQuantity;
    }
}