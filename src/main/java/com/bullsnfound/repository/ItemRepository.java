package com.bullsnfound.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bullsnfound.model.Item;

public interface ItemRepository extends MongoRepository<Item, String> {
    
}
