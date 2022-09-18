package com.example.accessingdatapostgresql;

import org.springframework.data.repository.CrudRepository;

//import com.example.accessingdatapostgresql.Items;

public interface ItemsRepository extends CrudRepository<Items, Integer> {
    
}
