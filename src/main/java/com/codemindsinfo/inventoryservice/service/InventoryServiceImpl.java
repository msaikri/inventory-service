package com.codemindsinfo.inventoryservice.service;

import com.codemindsinfo.inventoryservice.model.InventoryRequest;
import com.codemindsinfo.inventoryservice.model.InventoryResponse;
import com.codemindsinfo.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public boolean isInStock(String skuCode) {
        return inventoryRepository.isInStock(skuCode);
    }


    public List<InventoryResponse> isInStock(List<String> skuCodes) {
        return inventoryRepository.isInStock(skuCodes);
    }

    @Override
    public void insertStock(InventoryRequest inventoryRequest) {
        inventoryRepository.insertStock(inventoryRequest);
    }
}
