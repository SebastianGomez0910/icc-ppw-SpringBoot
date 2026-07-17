package ec.edu.ups.icc.fundamentos01.products.dtos;

import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Schema(description = "Datos requeridos para crear un producto")
public class CreateProductDto {
    
    @Schema(
        description = "Nombre del producto",
        example = "Laptop Lenovo ThinkPad"
    )
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 150, message = "El nombre debe tener entre 3 y 150 caracteres")
    private String name;
    
    @Schema(
        description = "Precio del producto en dólares",
        example = "799.99"
    )
    @NotNull(message = "El precio es obligatorio")
    @Min(value = 0, message = "El precio no puede ser negativo")
    private Double price;
    
    @Schema(
        description = "Cantidad disponible en stock",
        example = "25"
    )
    @NotNull(message = "El stock es obligatorio")
    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stock;

    @Schema(
        description = "Lista de IDs de categorías a las que pertenece el producto",
        example = "[1, 2, 3]"
    )
    @NotEmpty(message = "El ID de la categoría es obligatorio")
    private Set<Long> categoryIds;
    
    public CreateProductDto() {
    }

    public CreateProductDto(
            @NotBlank(message = "El nombre es obligatorio") @Size(min = 3, max = 150, message = "El nombre debe tener entre 3 y 150 caracteres") String name,
            @NotNull(message = "El precio es obligatorio") @Min(value = 0, message = "El precio no puede ser negativo") Double price,
            @NotNull(message = "El stock es obligatorio") @Min(value = 0, message = "El stock no puede ser negativo") Integer stock,
            @NotNull(message = "El ID de la categoría es obligatorio") Set<Long> categoryIds) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        
        this.categoryIds = categoryIds;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    public Set<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(Set<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
