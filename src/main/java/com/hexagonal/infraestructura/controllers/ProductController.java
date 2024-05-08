package com.hexagonal.infraestructura.controllers;

import com.hexagonal.application.usecase.ProductUseCaseImpl;
import com.hexagonal.domain.models.Product;
import com.hexagonal.domain.ports.in.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private final ProductService productService;

    @GetMapping
    public Flux<Product> getAll(){
    return productService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> getById(@PathVariable("id") int id){
        return productService.getById(id);
    }

    @GetMapping("/saludo")
    public Mono<String> saludo(){
        return Mono.just("¡Hola! Bienvenido al servicio de saludo.");
    }

    @PostMapping
    public Mono<Product> save(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("/{id}")
    public Mono<Product> update(@PathVariable("id") int id,@RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable("id") int id){
        return productService.delete(id);
    }
}
