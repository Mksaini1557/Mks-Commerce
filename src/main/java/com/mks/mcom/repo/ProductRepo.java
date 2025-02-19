package com.mks.mcom.repo;

import com.mks.mcom.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends CrudRepository<Product, Integer> {
}
