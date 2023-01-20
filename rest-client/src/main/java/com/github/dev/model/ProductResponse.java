package com.github.dev.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Data
@Builder
public class ProductResponse {
    private int productId;
    private String productName;
}
