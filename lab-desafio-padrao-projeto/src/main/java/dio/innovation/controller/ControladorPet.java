package dio.innovation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.innovation.model.Pet;
import dio.innovation.service.PetService;

@RestController
@RequestMapping("/api/pet")
public class ControladorPet {

    @Autowired
    private PetService petService;

    @PostMapping
    public Pet adicionarPet(@RequestBody Pet pet){
        return petService.adicionarPet(pet);
    }

    @DeleteMapping("/{id}")
    public void removerPet(@PathVariable Long id){
        petService.removerPet(id);
    }

    @GetMapping
    public List<Pet> exibirListPets(){
        return petService.exibirListPets();
    }
    
}
