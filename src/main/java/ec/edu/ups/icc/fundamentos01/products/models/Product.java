package ec.edu.ups.icc.fundamentos01.products.models;

import java.time.LocalDateTime;

import ec.edu.ups.icc.fundamentos01.products.dtos.CreateProductDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.PartialUpdateProductDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.ProductResponseDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.UpdateProductDto;
import ec.edu.ups.icc.fundamentos01.products.entity.ProductEntity;

public class Product {
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean deleted;
    
    public Product(Long id, String name, Double price, Integer stock, LocalDateTime createdAt, LocalDateTime updatedAt,
            boolean deleted) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleted = deleted;
    }
    
    public static Product fromDto(CreateProductDto dto) {
        return new Product(
                null, 
                dto.getName(), 
                dto.getPrice(), 
                dto.getStock(), 
                LocalDateTime.now(), 
                null, 
                false
        );
    }

    public static Product fromEntity(ProductEntity entity) {
        return new Product(
                entity.getId(),
                entity.getName(),
                entity.getPrice(),
                entity.getStock(),
                entity.getCreatedAt(),
                entity.getUpdatedAt(),
                entity.isDeleted()
        );
    }

    public ProductEntity toEntity() {
        ProductEntity entity = new ProductEntity();
        if (this.id != null) {
            entity.setId(this.id);
        }
        entity.setName(this.name);
        entity.setPrice(this.price);
        entity.setStock(this.stock);
        return entity;
    }

    public ProductResponseDto toResponseDto() {
        ProductResponseDto response = new ProductResponseDto();
        response.setName(this.name);
        response.setPrice(this.price);
        response.setStock(this.stock);
        return response;
    }

    public void update(UpdateProductDto dto) {
        this.name = dto.getName();
        this.price = dto.getPrice();
        this.stock = dto.getStock();
    }

    public void partialUpdate(PartialUpdateProductDto dto) {
        if (dto.getName() != null) this.name = dto.getName();
        if (dto.getPrice() != null) this.price = dto.getPrice();
        if (dto.getStock() != null) this.stock = dto.getStock();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public boolean isDeleted() {
        return deleted;
    }
}
