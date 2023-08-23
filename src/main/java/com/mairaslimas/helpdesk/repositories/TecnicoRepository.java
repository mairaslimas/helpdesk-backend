package com.mairaslimas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mairaslimas.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
