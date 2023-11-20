package via.sdj3.slaughterhousepart2.grpcClient.animal;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.checkerframework.checker.units.qual.A;
import via.sdj3.slaughterhousepart2.entity.Animal;
import via.sdj3.slaughterhousepart2.generated.animal.AnimalObj;
import via.sdj3.slaughterhousepart2.generated.animal.AnimalServiceGrpc;
import via.sdj3.slaughterhousepart2.generated.animal.RequestText;

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
        Animal realObj = getAnimalById(animalObjFromServer.getId());
        System.out.println(realObj.getName());
        return realObj;
    }

    @Override
    public Animal getAnimalById(int id) {
        AnimalObj animalObjFromServer;
        RequestText idReqText = RequestText.newBuilder().setInputText(id).build();
        try
        {
            animalObjFromServer = getAnimalBlockingStub().getAnimalById(idReqText);
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
        Animal realObj = new Animal(animalObjFromServer.getId(), animalObjFromServer.getDate(), animalObjFromServer.getName(), animalObjFromServer.getOrigin(), animalObjFromServer.getWeight());
        return realObj;
    }
}
