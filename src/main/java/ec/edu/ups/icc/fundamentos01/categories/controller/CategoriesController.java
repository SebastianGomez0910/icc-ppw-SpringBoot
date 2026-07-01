package ec.edu.ups.icc.fundamentos01.categories.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.ups.icc.fundamentos01.categories.dtos.CategoryResponseDto;
import ec.edu.ups.icc.fundamentos01.categories.servicies.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    
    private final CategoryService service;

    public CategoriesController(CategoryService service) {
        this.service = service;
    }

    
}
