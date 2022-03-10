package com.pjem.pessoas.DTO.mapping;

import com.pjem.pessoas.DTO.request.PersonDTO;
import com.pjem.pessoas.entity.Person;
import org.mapstruct.Mapping;

public interface PersonMapper {

    @Mapping(target = "aniversario", source = "aniversario", dateFormat = "dd-MM-yyyy")
    @Mapping(target = "cadastro", source = "cadastro", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);
    PersonDTO toDTO(Person dto);
}
