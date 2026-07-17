package ec.edu.ups.icc.fundamentos01.products.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.ups.icc.fundamentos01.core.dto.PaginationDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.CreateProductDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.PartialUpdateProductDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.ProductResponseDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.UpdateProductDto;
import ec.edu.ups.icc.fundamentos01.products.services.ProductService;
import ec.edu.ups.icc.fundamentos01.security.services.UserDetailsImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(
    name="Producto",
    description = "Gestion de productos con paginacion, roles y ownership"
)
@SecurityRequirement(name="bearerAuth")
@RestController
@RequestMapping("/products")
public class ProductsController {
    
    private final ProductService service;

    public ProductsController(ProductService service) {
        this.service = service;
    }

    @Operation(summary = "Listar productos", description = "Obtiene todos los productos disponibles")
    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<ProductResponseDto> findAll() {
        return service.findAll();
    }

    @Operation(summary = "Buscar producto por ID", description = "Obtiene un producto específico según su identificador")
    @GetMapping("/{id}")
    public ProductResponseDto findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @Operation(summary = "Crear producto", description = "Crea un nuevo producto en el sistema")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDto create(@Valid @RequestBody CreateProductDto dto,
                                     @AuthenticationPrincipal UserDetailsImpl currentUser) {
        return service.create(dto, currentUser);
    }

     @Operation(summary = "Actualizar producto", description = "Actualiza completamente un producto existente")
    @PutMapping("/{id}")
    public ProductResponseDto update(@Valid @PathVariable Long id,
                                     @RequestBody UpdateProductDto dto,
                                     @AuthenticationPrincipal UserDetailsImpl currentUser) {
        return service.update(id, dto, currentUser);
    }

    @Operation(summary = "Actualizar parcialmente producto", description = "Modifica parcialmente los datos de un producto")
    @PatchMapping("/{id}")
    public ProductResponseDto partialUpdate(@Valid @PathVariable Long id,
                                            @RequestBody PartialUpdateProductDto dto,
                                            @AuthenticationPrincipal UserDetailsImpl currentUser) {
        return service.partialUpdate(id, dto, currentUser);
    }

    @Operation(summary = "Eliminar producto", description = "Elimina un producto del sistema")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id,
                       @AuthenticationPrincipal UserDetailsImpl currentUser) {
        service.delete(id, currentUser);
    }

    @Operation(summary = "Buscar productos por usuario", description = "Obtiene todos los productos asociados a un usuario específico")
    @GetMapping("/user/{userId}")
    public List<ProductResponseDto> findByUserId(@PathVariable Long userId) {
        return service.findByUserId(userId);
    }

    @Operation(summary = "Buscar productos por categoría", description = "Obtiene todos los productos asociados a una categoría específica")
    @GetMapping("/category/{categoryId}")
    public List<ProductResponseDto> findByCategoryId(@PathVariable Long categoryId) {
        return service.findByCategoryId(categoryId);
    }

    @Operation(summary = "Listar productos paginados", description = "Obtiene productos en formato de página con parámetros de paginación")
    @GetMapping("/page")
    public Page<ProductResponseDto> findAllPage(@Valid @ModelAttribute PaginationDto pagination) {
        return service.findAllPage(pagination);
    }

    @Operation(summary = "Listar productos en formato slice", description = "Obtiene productos en formato slice con soporte de usuario autenticado")
    @GetMapping("/slice")
    public Slice<ProductResponseDto> slice(Pageable pageable,
                                           @AuthenticationPrincipal UserDetailsImpl currentUser) {
        return service.slice(pageable, currentUser);
    }
}   