package com.github.dev.contract.impl;

import com.github.dev.proto.v1.ProductRequest;
import com.github.dev.proto.v1.ProductResponse;
import com.github.dev.proto.v1.ProductServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import com.github.dev.contract.ProductGrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@GrpcService
public class ProductGrpcServiceImpl extends ProductServiceGrpc.ProductServiceImplBase
implements ProductGrpcService {

    private static final Logger logger = LoggerFactory.getLogger(ProductGrpcServiceImpl.class);
    @Override
    public void getProductById(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {

        ProductResponse response = ProductResponse.newBuilder()
                .setProductId(request.getProductId())
                .setProductName("ProductNameTest")
                .build();

        logger.info("request {}", request);
        logger.info("response {}", response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}