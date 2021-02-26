package es.anaya.spring.data.s03.mapstruct;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.anaya.spring.data.s03.mapstruct.domain.Owner;
import es.anaya.spring.data.s03.mapstruct.dto.OwnerDTO;
import es.anaya.spring.data.s03.mapstruct.mappings.OwnerToOwnerDTOMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OwnerToOwnerDTOMapperTest {

	@Autowired
	private OwnerToOwnerDTOMapper ownerToOwnerDTOMapper;


	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldMapOwnerToOwnerDTO() {
		Owner owner = new Owner();
		owner.setId(1L);
		owner.setName("Eugenia");
		
		OwnerDTO ownerDTO = ownerToOwnerDTOMapper.ownerToOwnerDTO(owner);
		
	    assertEquals(owner.getId(), ownerDTO.getId());	  
	    assertEquals(owner.getName(), ownerDTO.getName());
	    
	    Owner otherOwner = ownerToOwnerDTOMapper.ownerDTOToOwner(ownerDTO);
	    
	    assertEquals(otherOwner.getId(), ownerDTO.getId());	  
	    assertEquals(otherOwner.getName(), ownerDTO.getName());
	   
	}
	
}
