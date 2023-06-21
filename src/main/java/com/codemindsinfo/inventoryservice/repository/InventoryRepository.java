package com.codemindsinfo.inventoryservice.repository;

import com.codemindsinfo.inventoryservice.constants.InventoryConstants;
import com.codemindsinfo.inventoryservice.model.Inventory;
import com.codemindsinfo.inventoryservice.model.InventoryRequest;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class InventoryRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public boolean isInStock(String skuCode) {
        Query query = new Query();
        query.addCriteria(Criteria.where("skuCode").is(skuCode));
        Inventory inventory = mongoTemplate.findOne(query, Inventory.class, InventoryConstants.INVENTORY_COLLECTION);
        return (Objects.nonNull(inventory)
                && Objects.nonNull(inventory.getSkuCode())
                && StringUtils.isNotEmpty(inventory.getSkuCode()));
    }

    public void insertStock(InventoryRequest inventoryRequest) {
        Inventory inventory = Inventory.builder()
                .skuCode(inventoryRequest.getSkuCode())
                .quantity(inventoryRequest.getQuantity())
                .build();

        mongoTemplate.save(inventory);
    }
}
