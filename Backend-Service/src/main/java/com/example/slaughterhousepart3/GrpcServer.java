package com.example.slaughterhousepart3;

import com.example.slaughterhousepart3.entity.AnimalPart;
import com.example.slaughterhousepart3.generated.animal.AnimalObj;
import com.example.slaughterhousepart3.generated.product.ProductServiceGrpc;
import com.example.slaughterhousepart3.generated.animal.RequestText;
import com.example.slaughterhousepart3.generated.animal.ResponseText;
import com.example.slaughterhousepart3.repository.AnimalRepository;
import com.example.slaughterhousepart3.server.AnimalServiceImplementation;
import com.example.slaughterhousepart3.service.AnimalService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;


@SpringBootApplication
public class GrpcServer {
	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(GrpcServer.class, args);
	}


	public Server grpcServer(AnimalServiceImplementation animalServiceImplementation) throws IOException {
		return ServerBuilder.forPort(8080)
				.addService(animalServiceImplementation)
				.build();
	}

}
