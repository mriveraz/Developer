package es.anaya.spring.data.s03.mapstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import es.anaya.spring.data.s03.mapstruct.domain.House;
import es.anaya.spring.data.s03.mapstruct.domain.Owner;
import es.anaya.spring.data.s03.mapstruct.domain.repositories.HouseRepository;
import es.anaya.spring.data.s03.mapstruct.domain.repositories.OwnerRepository;
import es.anaya.spring.data.s03.mapstruct.dto.OwnerDTO;
import es.anaya.spring.data.s03.mapstruct.mappings.HouseToHouseDTOMapper;
import es.anaya.spring.data.s03.mapstruct.mappings.OwnerToOwnerDTOMapper;

@SpringBootApplication
public class Application implements CommandLineRunner {
 @Autowired
 private OwnerRepository ownerRepository;
 
 @Autowired
 private HouseRepository houseRepository;
 
 @Autowired
 private OwnerToOwnerDTOMapper ownerToOwnerDTOMapper;

 @Autowired
 private HouseToHouseDTOMapper houseToHouseDTOMapper;

 
 public static void main(String[] args) {
  SpringApplication.run(Application.class, args);
 }

 @Transactional(readOnly = true)
 @Override
 public void run(String... args) throws Exception {

  System.out.println("Showing all records");
  for (Owner owner : ownerRepository.findAll()) {
   System.out.println(owner);
  }
  
  Owner owner = ownerRepository.findById(1L).get();
  OwnerDTO ownerDTO = ownerToOwnerDTOMapper.ownerToOwnerDTO(owner);
  System.out.println(owner);
  System.out.println(ownerDTO);
  
  Iterable<House> houses = houseRepository.findAll();

  for (House house: houses) {
   System.out.println(houseToHouseDTOMapper.houseToHouseDTO(house));
  }

 }
}
