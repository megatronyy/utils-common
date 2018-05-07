package org.quwb.utils.server;

import io.grpc.stub.StreamObserver;
import org.quwb.utils.rpc.proto.GreeterGrpc;
import org.quwb.utils.rpc.proto.HelloReply;
import org.quwb.utils.rpc.proto.HelloRequest;

/**
 * @author quwb
 * @create 2018-05-07 13:31
 * @desc
 **/
public class GreeterImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("service:"+request.getName());
        HelloReply reply = HelloReply.newBuilder().setMessage(("Hello: " + request.getName())).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
