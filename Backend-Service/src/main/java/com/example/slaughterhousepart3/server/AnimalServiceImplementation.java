package com.example.slaughterhousepart3.server;

import com.example.slaughterhousepart3.generated.animal.AnimalObj;
import com.example.slaughterhousepart3.generated.animal.AnimalServiceGrpc;
import com.example.slaughterhousepart3.service.AnimalService;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImplementation extends AnimalServiceGrpc.AnimalServiceImplBase {

    AnimalService animalService;

    public AnimalServiceImplementation(AnimalService animalService) {
        this.animalService = animalService;
    }

    @Override
    public void addAnimal(AnimalObj obj, StreamObserver<AnimalObj> streamObserver)
    {
        int id = obj.getId();
        String date = obj.getDate();
        String name = obj.getName();
        String origin = obj.getOrigin();
        double weight = obj.getWeight();



        streamObserver.onNext(obj);
        streamObserver.onCompleted();
        System.out.println("Great, success! ");
    }

}
