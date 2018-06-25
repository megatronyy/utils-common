//package org.quwb.utils.rpc.client;
//
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import org.quwb.utils.rpc.proto.GreeterGrpc;
//import org.quwb.utils.rpc.proto.HelloReply;
//import org.quwb.utils.rpc.proto.HelloRequest;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
///**
// * @author quwb
// * @create 2018-05-07 11:02
// * @desc
// **/
//public class RpcClient {
//    private static final Logger logger = LoggerFactory.getLogger(RpcClient.class);
//    private final ManagedChannel channel;
//    private final GreeterGrpc.GreeterBlockingStub blockingStub;
//
//    public RpcClient(String host, int port){
//        channel = ManagedChannelBuilder.forAddress(host,port)
//                .usePlaintext(true)
//                .build();
//        blockingStub = GreeterGrpc.newBlockingStub(channel);
//    }
//
//    public void shutdown() throws InterruptedException{
//        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
//    }
//
//    public void greet(String name){
//        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
//        HelloReply reply = blockingStub.sayHello(request);
//        logger.info(reply.getMessage());
//    }
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        RpcClient client = new RpcClient("127.0.0.1", 50051);
//        for(int i=0;i<5;i++){
//            client.greet("world:"+i);
//        }
//
//        client.shutdown();
//
//        System.in.read();
//    }
//}
