package com.codemindsinfo.inventoryservice.service;

import com.codemindsinfo.inventoryservice.constants.InventoryConstants;
import com.codemindsinfo.inventoryservice.model.Inventory;
import com.codemindsinfo.inventoryservice.model.InventoryRequest;
import com.codemindsinfo.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public boolean isInStock(String skuCode) {
        return inventoryRepository.isInStock(skuCode);
    }

    @Override
    public void insertStock(InventoryRequest inventoryRequest) {
        inventoryRepository.insertStock(inventoryRequest);
    }
}
