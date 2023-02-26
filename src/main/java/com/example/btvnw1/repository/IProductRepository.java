package com.example.btvnw1.repository;

import com.example.btvnw1.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IProductRepository extends CrudRepository<Product,Long> {
}
