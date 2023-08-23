package com.mairaslimas.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mairaslimas.helpdesk.domain.Chamado;
import com.mairaslimas.helpdesk.domain.Cliente;
import com.mairaslimas.helpdesk.domain.Tecnico;
import com.mairaslimas.helpdesk.domain.enums.Perfil;
import com.mairaslimas.helpdesk.domain.enums.Prioridade;
import com.mairaslimas.helpdesk.domain.enums.Status;
import com.mairaslimas.helpdesk.repositories.ChamadoRepository;
import com.mairaslimas.helpdesk.repositories.ClienteRepository;
import com.mairaslimas.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null,"Valdir Cezar","92306813000","valdir@mail.com","123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null,"Linus Torvalds","64474635060","torvalds@mail.com","123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
