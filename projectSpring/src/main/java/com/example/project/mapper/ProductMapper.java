package com.example.project.mapper;

import com.example.project.DTO.product.ProductCreateDTO;
import com.example.project.DTO.product.ProductResponseDTO;
import com.example.project.entity.Product;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(ProductCreateDTO product);
    ProductResponseDTO toResponse(Product product);

    default Page<ProductResponseDTO> toProductResponsePage(Page<Product> productsPage) {
        return productsPage.map(this::toResponse);
    }

    List<ProductResponseDTO> toResponseList(List<Product> products);
}

