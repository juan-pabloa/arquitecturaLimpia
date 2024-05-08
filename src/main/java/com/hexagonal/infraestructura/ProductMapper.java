package com.hexagonal.infraestructura;

import com.hexagonal.domain.models.Product;
import com.hexagonal.infraestructura.entities.ProductoEntity;
import org.mapstruct.Mapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    Product toDto(ProductoEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    ProductoEntity toEntity(Product dto);
}