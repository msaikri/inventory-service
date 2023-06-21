package com.codemindsinfo.inventoryservice.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryRequest {
    private String skuCode;
    private Integer quantity;
}
