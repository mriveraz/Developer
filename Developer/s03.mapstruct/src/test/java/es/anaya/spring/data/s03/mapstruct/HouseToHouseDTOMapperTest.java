package es.anaya.spring.data.s03.mapstruct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.anaya.spring.data.s03.mapstruct.domain.House;
import es.anaya.spring.data.s03.mapstruct.dto.HouseDTO;
import es.anaya.spring.data.s03.mapstruct.mappings.HouseToHouseDTOMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseToHouseDTOMapperTest {
	@Autowired
	private HouseToHouseDTOMapper houseToHouseDTOMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldMapHouseToHouseDTO() {
		House house = new House();
		house.setId(1L);
		house.setName("Eugenia");
		
		HouseDTO houseDTO = houseToHouseDTOMapper.houseToHouseDTO(house);
		
	    assertEquals(house.getId(), houseDTO.getId());	  
	    assertEquals(house.getName(), houseDTO.getName());
	    
	    House otherHouse = houseToHouseDTOMapper.houseDTOToHouse(houseDTO);
	    
	    assertEquals(otherHouse.getId(), houseDTO.getId());	  
	    assertEquals(otherHouse.getName(), houseDTO.getName());
	   
	}
	
}
