package com.github.dev.service;

import com.github.dev.model.ProductResponse;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public interface ProductService {
    ProductResponse getProductById(int id);
}
