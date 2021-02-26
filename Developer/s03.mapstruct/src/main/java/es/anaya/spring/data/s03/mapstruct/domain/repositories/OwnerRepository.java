package es.anaya.spring.data.s03.mapstruct.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import es.anaya.spring.data.s03.mapstruct.domain.Owner;
import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    List<Owner> findByName(String name);
}