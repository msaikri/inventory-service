package com.codemindsinfo.inventoryservice.controller;

import com.codemindsinfo.inventoryservice.model.InventoryRequest;
import com.codemindsinfo.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory/")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skuCode) {
        return inventoryService.isInStock(skuCode);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String insertStock(@RequestBody InventoryRequest inventoryRequest) {
        inventoryService.insertStock(inventoryRequest);
        return "Stock Inserted Successfully!";
    }
}
