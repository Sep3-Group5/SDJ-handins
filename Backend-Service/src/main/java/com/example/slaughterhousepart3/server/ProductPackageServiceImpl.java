package com.example.slaughterhousepart3.server;

import com.example.slaughterhousepart3.generated.RequestText;
import com.example.slaughterhousepart3.generated.ResponseText;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class ProductPackageServiceImpl  {
	public void PackageProduct(RequestText request, StreamObserver<ResponseText> responseObserver){
		//super.packageProduct(request, responseObserver);
		String input = request.getInputText();
		String output = responseObserver.toString();

		//generate product id
		UUID uuid = UUID.randomUUID();
		String productId = uuid.toString();

		//log
		System.out.println("Input: " + input + " and Output: " + output);
		String respondMessage = "Input: " + input + " and Output: " + output + "was send.";
		ResponseText packageResponse = ResponseText .newBuilder().build();

		//send response to the client
		responseObserver.onNext(packageResponse);

		//notifies that the call is completed
		responseObserver.onCompleted();
		System.out.println(respondMessage);
	}
}
