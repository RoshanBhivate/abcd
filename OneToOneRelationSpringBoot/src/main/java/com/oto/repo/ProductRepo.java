package com.oto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oto.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
