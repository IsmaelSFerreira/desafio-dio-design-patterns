package dio.innovation.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dio.innovation.model.Pet;

public interface PetDb extends JpaRepository<Pet, Long> {
    
}
