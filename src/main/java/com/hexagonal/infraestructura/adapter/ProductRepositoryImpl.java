package com.hexagonal.infraestructura.adapter;

import com.hexagonal.domain.models.Product;
import com.hexagonal.domain.ports.out.ProductRepository;
import com.hexagonal.infraestructura.ProductMapper;
import com.hexagonal.infraestructura.entities.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductRepositoryI repository;
    private final ProductMapper productMapper;

    public ProductRepositoryImpl(ProductRepositoryI repository,ProductMapper productMapper) {
        this.repository = repository;
        this.productMapper = productMapper;
    }

    @Override
    public Mono<Void> deleteById(int id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<Product> findById(int id) {
        return repository.findById(id).map(productMapper::toDto);
    }

    @Override
    public Mono<Product> save(Product product) {
        ProductoEntity entity = productMapper.toEntity(product);
        return repository.save(entity).map(productMapper::toDto);
    }

    @Override
    public Flux<Product> findAll() {
        return repository.findAll().map(productMapper::toDto);
    }

}
