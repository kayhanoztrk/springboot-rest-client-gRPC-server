package com.github.dev.mapper;

import com.github.dev.model.ProductResponse;
import com.github.dev.proto.v1.Product;
import org.springframework.stereotype.Component;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Component
public class ProductMapper {

    public ProductResponse convertProtobufToDto(com.github.dev.proto.v1.ProductResponse response){
        ProductResponse productResponse = ProductResponse.builder()
                .productId(response.getProductId()).productName(response.getProductName())
                .build();

        return productResponse;
    }
}
