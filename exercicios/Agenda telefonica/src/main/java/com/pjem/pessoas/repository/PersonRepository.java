package com.pjem.pessoas.repository;

import com.pjem.pessoas.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
