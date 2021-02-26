package es.anaya.spring.data.s03.mapstruct.mappings;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.anaya.spring.data.s03.mapstruct.domain.House;
import es.anaya.spring.data.s03.mapstruct.dto.HouseDTO;



@Mapper(componentModel = "spring")
public interface HouseToHouseDTOMapper {
HouseToHouseDTOMapper INSTANCE = Mappers.getMapper(HouseToHouseDTOMapper.class);
	
	HouseDTO houseToHouseDTO(House house);
	House houseDTOToHouse(HouseDTO houseDTO);

}
