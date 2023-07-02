package com.codemindsinfo.inventoryservice.service;

import com.codemindsinfo.inventoryservice.model.InventoryRequest;
import com.codemindsinfo.inventoryservice.model.InventoryResponse;

import java.util.List;

public interface InventoryService {

    boolean isInStock(String skuCode);

    List<InventoryResponse> isInStock(List<String> skuCodes);

    void insertStock(InventoryRequest inventoryRequest);
}
