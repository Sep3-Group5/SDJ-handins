package via.sdj3.slaughterhousepart2.grpcClient.animal;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import via.sdj3.slaughterhousepart2.entity.Animal;
import via.sdj3.slaughterhousepart2.generated.animal.AnimalObj;
import via.sdj3.slaughterhousepart2.generated.animal.AnimalServiceGrpc;

public class GRPCAnimalClientImpl implements AnimalClient
{
    private AnimalServiceGrpc.AnimalServiceBlockingStub animalBlockingStub;

    public AnimalServiceGrpc.AnimalServiceBlockingStub getAnimalBlockingStub()
    {
        if (animalBlockingStub == null)
        {
            ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 5021).usePlaintext().build();
            animalBlockingStub = AnimalServiceGrpc.newBlockingStub(managedChannel);
        }
        return animalBlockingStub;
    }

    @Override
    public Animal addAnimal(Animal animal) {
        AnimalObj animalObj = AnimalObj.newBuilder().setId(animal.getAnimalId()).setName(animal.getName()).setDate(animal.getDateOfArrival()).setOrigin(animal.getPlaceOfOrigin()).setWeight(animal.getWeight()).build();
        AnimalObj animalObjFromServer;

        try
        {
            animalObjFromServer = getAnimalBlockingStub().addAnimal(animalObj);
        }
        catch (StatusRuntimeException sre)
        {
            System.out.println(sre.getStatus().getDescription());
            throw new RuntimeException(sre.getStatus().getDescription());
        }
        finally
        {
            animalBlockingStub = null;
        }

        System.out.println(animalObjFromServer.getName());
        String animalDescription = getAnimalById(animalObjFromServer.getId());
        System.out.println(realObj.getName());
        return realObj;
    }

    @Override
    public String getAnimalById(int id) {
        return null;
    }
}
