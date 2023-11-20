package via.sdj3.slaughterhousepart2.grpcClient.animal;

import via.sdj3.slaughterhousepart2.entity.Animal;

public interface AnimalClient {
    Animal addAnimal (Animal animal);
    String getAnimalById (int id);
}
