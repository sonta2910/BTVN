package com.example.btvnw1.service.impl;

import com.example.btvnw1.model.Product;
import com.example.btvnw1.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
   @Autowired
    private IProductRepository productRepository;
   public Product save(Product product){
       return productRepository.save(product);
   }
   public void delete(Long id){
       productRepository.deleteById(id);
   }
   public List<Product> findAll(){
       return (List<Product>) productRepository.findAll();
   }
   public Product findById(Long id){
       return productRepository.findById(id).orElse(null);
   }
}
