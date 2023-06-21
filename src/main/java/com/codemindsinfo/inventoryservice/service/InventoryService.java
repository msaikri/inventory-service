package com.codemindsinfo.inventoryservice.service;

import com.codemindsinfo.inventoryservice.model.InventoryRequest;

public interface InventoryService {

    boolean isInStock(String skuCode);

    void insertStock(InventoryRequest inventoryRequest);
}
