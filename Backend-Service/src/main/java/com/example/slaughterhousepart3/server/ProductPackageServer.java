package com.example.slaughterhousepart3.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
public class ProductPackageServer {
    public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(5006).addService((BindableService) new ProductPackageServiceImpl()).build();

		server.start();

        System.out.println("gRPC! Server started on Port: " + server.getPort());

		//Server is kept alive for client to communicate
		server.awaitTermination();
    }
}
