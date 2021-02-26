package es.anaya.spring.data.s03.mapstruct.mappings;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import es.anaya.spring.data.s03.mapstruct.domain.Owner;
import es.anaya.spring.data.s03.mapstruct.dto.OwnerDTO;

@Mapper(componentModel = "spring")
public interface OwnerToOwnerDTOMapper {

	OwnerToOwnerDTOMapper INSTANCE = Mappers.getMapper(OwnerToOwnerDTOMapper.class);
	
	@Mappings({
        @Mapping(source="id", target="id"),
        @Mapping(source="name", target="name")
	})
    OwnerDTO ownerToOwnerDTO(Owner owner);
	
	@Mappings({
        @Mapping(source="id", target="id"),
        @Mapping(source="name", target="name")
	})
    Owner ownerDTOToOwner(OwnerDTO ownerDTO);
}
