package com.example.slaughterhousepart3;

import com.example.slaughterhousepart3.entity.AnimalPart;
import com.example.slaughterhousepart3.generated.animal.AnimalObj;
import com.example.slaughterhousepart3.generated.product.ProductServiceGrpc;
import com.example.slaughterhousepart3.generated.animal.RequestText;
import com.example.slaughterhousepart3.generated.animal.ResponseText;
import com.example.slaughterhousepart3.repository.AnimalRepository;
import com.example.slaughterhousepart3.server.AnimalServiceImplementation;
import com.example.slaughterhousepart3.server.ProductPackageServiceImpl;
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

	/*
	@Bean
	public Server grpcServer(AnimalServiceImplementation animalServiceImplementation) throws IOException {
		return ServerBuilder.forPort(8080)
				.addService(animalServiceImplementation)
				.build();
	}
*/


}
/*

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
						super.ad
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


 */
