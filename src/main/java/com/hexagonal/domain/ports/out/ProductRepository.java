package com.hexagonal.domain.ports.out;

import com.hexagonal.domain.models.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ProductRepository  {

    Mono<Product> findById(int id);

    public Mono<Product> save(Product product);

    public Flux<Product> findAll();

    Mono<Void> deleteById(int id);

}
