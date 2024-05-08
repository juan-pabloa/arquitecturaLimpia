package com.hexagonal.application.usecase;

import com.hexagonal.domain.models.Product;
import com.hexagonal.domain.ports.in.ProductService;
import com.hexagonal.domain.ports.out.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductUseCaseImpl implements ProductService{

    private final ProductRepository repository;

    @Autowired
    public ProductUseCaseImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Product> getById(int id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Product> update(int id, Product product) {
        return repository.save(new Product(id, product.getName(), product.getPrice()));
    }

    @Override
    public Mono<Product> save(Product product) {
        return repository.save(product);
    }

    @Override
    public Flux<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Void> delete(int id) {
        return repository.deleteById(id);
    }

}
