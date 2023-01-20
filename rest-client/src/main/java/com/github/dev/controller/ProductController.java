package com.github.dev.controller;

import com.github.dev.model.ProductResponse;
import com.github.dev.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> findProductById(
            @PathVariable int productId){
        ProductResponse response = productService.getProductById(productId);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHi(){
        return ResponseEntity.ok("hellööö!");
    }
}
