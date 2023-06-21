package com.codemindsinfo.inventoryservice.model;

import com.codemindsinfo.inventoryservice.constants.InventoryConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value= InventoryConstants.INVENTORY_COLLECTION)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    private String id;
    private String skuCode;
    private Integer quantity;

}
