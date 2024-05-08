package com.hexagonal.infraestructura.adapter;


import com.hexagonal.infraestructura.entities.ProductoEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface ProductRepositoryI extends ReactiveCrudRepository<ProductoEntity, Integer> {


}
