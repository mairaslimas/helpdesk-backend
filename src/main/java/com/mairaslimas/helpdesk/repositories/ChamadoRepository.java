package com.mairaslimas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mairaslimas.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
