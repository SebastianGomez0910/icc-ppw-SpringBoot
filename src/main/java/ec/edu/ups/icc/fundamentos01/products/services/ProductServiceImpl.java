package ec.edu.ups.icc.fundamentos01.products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.ups.icc.fundamentos01.products.dtos.CreateProductDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.PartialUpdateProductDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.ProductResponseDto;
import ec.edu.ups.icc.fundamentos01.products.dtos.UpdateProductDto;
import ec.edu.ups.icc.fundamentos01.products.entity.ProductEntity;
import ec.edu.ups.icc.fundamentos01.products.mappers.ProductMapper;
import ec.edu.ups.icc.fundamentos01.products.models.Product;
import ec.edu.ups.icc.fundamentos01.products.models.ProductModel;
import ec.edu.ups.icc.fundamentos01.products.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public List<ProductResponseDto> findAll() {
       return productRepository.findAll()
                .stream()
                .filter(entity -> !entity.isDeleted())
                .map(Product::fromEntity)
                .map(Product::toResponseDto)
                .toList();
    }
    @Override
    public ProductResponseDto findOne(Long id) {
        return productRepository.findById(id)
                .filter(entity -> !entity.isDeleted())
                .map(Product::fromEntity)
                .map(Product::toResponseDto)
                .orElseThrow(() -> new IllegalStateException("Product not found"));
    }

    @Override
    public ProductResponseDto create(CreateProductDto dto) {
        Product product=Product.fromDto(dto);
        ProductEntity entity=product.toEntity();
        ProductEntity savedEntity=productRepository.save(entity);

        return Product.fromEntity(savedEntity).toResponseDto();
    }

    @Override
    public ProductResponseDto update(Long id, UpdateProductDto dto) {
        ProductEntity entity = productRepository.findById(id)
                .filter(prod -> !prod.isDeleted())
                .orElseThrow(() -> new IllegalStateException("Product not found"));

        Product product=Product.fromEntity(entity);
        product.update(dto);

        ProductEntity updatedEntity=product.toEntity();
        ProductEntity savedEntity=productRepository.save(updatedEntity);

        return Product.fromEntity(savedEntity).toResponseDto();
    }

    @Override
    public ProductResponseDto partialUpdate(Long id, PartialUpdateProductDto dto) {
        ProductEntity entity = productRepository.findById(id)
                .filter(prod -> !prod.isDeleted()) 
                .orElseThrow(() -> new IllegalStateException("Product not found or cannot be updated because it is deleted"));

        Product product = Product.fromEntity(entity);
        
        product.partialUpdate(dto);
        
        ProductEntity updatedEntity = product.toEntity();
        ProductEntity savedEntity = productRepository.save(updatedEntity);

        return Product.fromEntity(savedEntity).toResponseDto();
    }

    @Override
    public void delete(Long id) {
        ProductEntity entity = productRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Product not found"));

        if (entity.isDeleted()) {
            throw new IllegalStateException("Product is already deleted");
        }

        entity.setDeleted(true);
        productRepository.save(entity);
    }
}