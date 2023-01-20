package com.github.dev.service.impl;

import com.github.dev.mapper.ProductMapper;
import com.github.dev.proto.v1.ProductResponse;
import com.github.dev.proto.v1.ProductRequest;
import com.github.dev.proto.v1.ProductServiceGrpc;
import com.github.dev.service.ProductService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    private final ProductMapper productMapper;
    public ProductServiceImpl(ProductMapper productMapper){
        this.productMapper = productMapper;
    }
    @Override
    public com.github.dev.model.ProductResponse getProductById(int id) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext()
                .build();

        ProductServiceGrpc.ProductServiceBlockingStub blockingStub =
                ProductServiceGrpc.newBlockingStub(channel);

        ProductRequest request = ProductRequest
                .newBuilder().setProductId(1).build();

        ProductResponse response =  blockingStub.getProductById(request);
        channel.shutdown();
        return productMapper.convertProtobufToDto(response);
    }
}