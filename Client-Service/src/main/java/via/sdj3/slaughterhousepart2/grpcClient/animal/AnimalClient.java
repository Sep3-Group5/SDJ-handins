package via.sdj3.slaughterhousepart2.grpcClient.animal;

import via.sdj3.slaughterhousepart2.entity.Animal;

public interface AnimalClient {
    Animal addAnimal (Animal animal);
    Animal getAnimalById (int id);
}
