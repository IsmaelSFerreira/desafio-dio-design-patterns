package dio.innovation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.innovation.model.Pet;
import dio.innovation.repository.PetDb;

@Service
public class PetService {

    @Autowired
    private PetDb petDb;

    public Pet adicionarPet(Pet pet){
        return petDb.save(pet);
    }

    public void removerPet(Long id){
        petDb.deleteById(id);
    }

    public List<Pet> exibirListPets(){
        return petDb.findAll();
    }
    
}
