package com.hexagonal.domain.handler;

import com.hexagonal.domain.models.Product;
import com.hexagonal.domain.ports.in.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Component
@Slf4j
public class ProductHandler {

    //private final ProductService productService;

    /*public Mono<ServerResponse> getAll(ServerRequest request) {
        Flux<Product> products = productService.getAll();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(products,Product.class);
    }

    public Mono<ServerResponse> getOne(ServerRequest request) {
        int id = Integer.valueOf(request.pathVariable("id"));
        Mono<Product> product = productService.getById(id);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(product, Product.class);
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        Mono<Product> product = request.bodyToMono(Product.class);
        return product.flatMap(p -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(productService.save(p),Product.class));
        }

    public Mono<ServerResponse> update(ServerRequest request) {
        int id = Integer.valueOf(request.pathVariable("id"));
        Mono<Product> product = request.bodyToMono(Product.class);
        return product.flatMap(p -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(productService.update(id, p), Product.class));
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        int id = Integer.valueOf(request.pathVariable("id"));
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(productService.delete(id), Product.class);
    }*/
}
