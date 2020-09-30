package it.insiel.esempio1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import it.insiel.esempio1.model.Persona;

public interface PersonaRepository extends PagingAndSortingRepository<Persona, String> {

}
