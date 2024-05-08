package com.hexagonal.infraestructura.config;

import com.hexagonal.application.usecase.ProductUseCaseImpl;
import com.hexagonal.domain.models.Product;
import com.hexagonal.domain.ports.in.ProductService;
import com.hexagonal.domain.ports.out.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
@ComponentScan("com.hexagonal")
public class Config {

}
