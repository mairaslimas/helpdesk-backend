package com.mairaslimas.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mairaslimas.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
