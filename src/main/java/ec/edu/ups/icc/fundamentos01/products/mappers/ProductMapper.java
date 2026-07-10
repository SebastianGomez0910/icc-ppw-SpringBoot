package ec.edu.ups.icc.fundamentos01.products.mappers;

import java.time.LocalDateTime;

import ec.edu.ups.icc.fundamentos01.categories.dtos.CategoryResponseDto;
import ec.edu.ups.icc.fundamentos01.categories.entities.CategoryEntity;
import ec.edu.ups.icc.fundamentos01.products.dtos.CreateProductDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.ProductResponseDto;
import ec.edu.ups.icc.fundamentos01.products.entity.ProductEntity;
import ec.edu.ups.icc.fundamentos01.products.models.ProductModel;
import ec.edu.ups.icc.fundamentos01.users.entity.UserEntity;

public class ProductMapper {
    
    public static ProductModel toModelFromDTO(CreateProductDto dto){
        ProductModel model=new ProductModel();
        model.setName(dto.getName());
        model.setPrice(dto.getPrice());
        model.setStock(dto.getStock());
        model.setCreatedAt(LocalDateTime.now());
        return model;
    }

    public static ProductModel toModelFromEntity(ProductEntity entity) {
        ProductModel model = new ProductModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setPrice(entity.getPrice());
        model.setStock(entity.getStock());
        model.setCreatedAt(entity.getCreatedAt());
        model.setUpdatedAt(entity.getUpdatedAt());
        model.setDeleted(entity.isDeleted());

        model.setOwner(entity.getOwner());

        if (entity.getCategories() != null) {
            model.setCategories(entity.getCategories().stream().toList());
        }

        return model;
    }

    public static ProductEntity toEntityFromModel(ProductModel model) {
        ProductEntity entity = new ProductEntity();
        entity.setId(model.getId());
        entity.setName(model.getName());
        entity.setPrice(model.getPrice());
        entity.setStock(model.getStock());
        return entity;
    }

    public static ProductResponseDto toResponse(ProductModel model) {
        ProductResponseDto response = new ProductResponseDto();
        response.setId(model.getId());
        response.setName(model.getName());
        response.setPrice(model.getPrice());
        response.setStock(model.getStock());
        response.setCreatedAt(model.getCreatedAt());
        response.setUpdatedAt(model.getUpdatedAt());

        if(model.getOwner()!=null){
            response.setOwner(toOwnerResponse(model.getOwner()));
        }

        if (model.getCategories() != null) {
            response.setCategories(
                model.getCategories().stream()
                    .map(ProductMapper::toCategoryResponse)
                    .toList()
            );
        }

        return response;
    }

    public static ProductResponseDto.UserSummaryDto toOwnerResponse(UserEntity owner){
        ProductResponseDto.UserSummaryDto ownerDto= new ProductResponseDto.UserSummaryDto();
        ownerDto.setId(owner.getId());
        ownerDto.setName(owner.getName());
        ownerDto.setEmail(owner.getEmail());

        return ownerDto;
    }


    private static CategoryResponseDto toCategoryResponse(CategoryEntity category) {
        CategoryResponseDto catDto = new CategoryResponseDto();
        catDto.setId(category.getId());
        catDto.setName(category.getName());
        catDto.setDescription(category.getDescription());
        return catDto;
    }
}