package com.pjem.pessoas.controller;

import com.pjem.pessoas.entity.Person;
import com.pjem.pessoas.exception.PersonNotFoundException;
import com.pjem.pessoas.service.PersonService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person cria(@RequestBody @Valid Person person){
        return service.grava(person);
    }

    @GetMapping
    public List<Person> lista(){return service.lista();}


    @GetMapping("/id/{id}")
    public ResponseEntity listaId(@PathVariable int id) throws PersonNotFoundException {
        return service.listaId(id);
    }
}
