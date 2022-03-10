package com.pjem.pessoas.service;

import com.pjem.pessoas.DTO.response.MessageResponseDTO;
import com.pjem.pessoas.entity.Person;
import com.pjem.pessoas.exception.PersonNotFoundException;
import com.pjem.pessoas.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person grava(Person person){
        return repository.save(person);
    }


    public List<Person> lista(){
        List<Person> pessoa = repository.findAll();
        return repository.findAll();
    }



    public ResponseEntity listaId(int id) throws PersonNotFoundException {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }



}

