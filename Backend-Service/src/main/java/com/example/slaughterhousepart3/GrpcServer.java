package com.example.slaughterhousepart3;

import com.example.slaughterhousepart3.generated.animal.AnimalObj;
import com.example.slaughterhousepart3.generated.product.ProductServiceGrpc;
import com.example.slaughterhousepart3.generated.animal.RequestText;
import com.example.slaughterhousepart3.generated.animal.ResponseText;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class GrpcServer {
	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(8080)

			.addService(new ProductServiceGrpc.ProductServiceImplBase() {

				public void addAnimal(AnimalObj request, StreamObserver<AnimalObj> responseObserver) {
					super.addAnimal(request, responseObserver);
				}


				public void getAnimalById(RequestText request, StreamObserver<ResponseText> responseObserver) {
					super.getAnimalById(request, responseObserver);
				}
			}).build();

		server.start();
		System.out.println("Server started on port : " + server.getPort());
		server.awaitTermination();

	}
}
