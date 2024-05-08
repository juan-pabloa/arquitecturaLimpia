package com.hexagonal.domain.ports.in;

import com.hexagonal.domain.models.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ProductService {

   public Mono<Product> getById (int id);

   public  Mono <Product> update (int id, Product product);

   public Mono <Product> save (Product product);

   public Flux<Product> getAll();

   Mono<Void> delete(int id);
}
