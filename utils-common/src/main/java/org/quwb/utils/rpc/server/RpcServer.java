//package org.quwb.utils.rpc.server;
//
//import io.grpc.Server;
//import io.grpc.ServerBuilder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.IOException;
//
//
///**
// * @author quwb
// * @create 2018-05-07 11:02
// * @desc
// **/
//public class RpcServer {
//
//    private static final Logger logger = LoggerFactory.getLogger(RpcServer.class);
//
//    private int port = 50051;
//    private Server server;
//
//    private void start() throws IOException {
//        server = ServerBuilder.forPort(port)
//                .addService(new GreeterImpl())
//                .build()
//                .start();
//
//        logger.info("RPC服务开始.......");
//
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                logger.info("jvm关闭之前，关闭gRPC服务");
//                RpcServer.this.stop();
//                logger.info("服务关闭");
//            }
//        });
//    }
//
//    private void stop() {
//        if (server != null) {
//            server.shutdown();
//        }
//    }
//
//    private void blockUntilShutdown() throws InterruptedException {
//        if (server != null) {
//            server.awaitTermination();
//        }
//    }
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        final RpcServer server = new RpcServer();
//        server.start();
//        server.blockUntilShutdown();
//    }
//}
