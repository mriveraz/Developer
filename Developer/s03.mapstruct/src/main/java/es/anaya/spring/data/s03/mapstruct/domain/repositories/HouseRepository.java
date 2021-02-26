package es.anaya.spring.data.s03.mapstruct.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import es.anaya.spring.data.s03.mapstruct.domain.House;
import java.util.List;

public interface HouseRepository extends CrudRepository<House, Long> {
    List<House> findByName(String name);
}