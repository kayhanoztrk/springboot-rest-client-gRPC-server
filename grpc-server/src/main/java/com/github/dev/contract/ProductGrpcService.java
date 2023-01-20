package com.github.dev.contract;
import io.grpc.stub.StreamObserver;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public interface ProductGrpcService {
    void getProductById(com.github.dev.proto.v1.ProductRequest request,
                        StreamObserver<com.github.dev.proto.v1.ProductResponse> responseObserver);
}
