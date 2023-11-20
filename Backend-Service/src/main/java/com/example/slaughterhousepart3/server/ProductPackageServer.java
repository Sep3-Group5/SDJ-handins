package com.example.slaughterhousepart3.server;

import com.sun.security.ntlm.Server;

import java.io.IOException;

public class ProductPackageServer {
    public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(5006).addService(new ProductPackageServiceImpl()).build();

		server.start();

        System.out.println("gRPC! Server started on Port: " + server.getPort());

		//Server is kept alive for client to communicate
		server.awaitTermination();
    }
}
