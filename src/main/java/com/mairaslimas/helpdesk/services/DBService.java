package com.mairaslimas.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mairaslimas.helpdesk.domain.Chamado;
import com.mairaslimas.helpdesk.domain.Cliente;
import com.mairaslimas.helpdesk.domain.Tecnico;
import com.mairaslimas.helpdesk.domain.enums.Perfil;
import com.mairaslimas.helpdesk.domain.enums.Prioridade;
import com.mairaslimas.helpdesk.domain.enums.Status;
import com.mairaslimas.helpdesk.repositories.ChamadoRepository;
import com.mairaslimas.helpdesk.repositories.PessoaRepository;

@Service
public class DBService {
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null,"Valdir Cezar","923.068.130-00","valdir@mail.com",encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null,"Richard Stallman","997.982.740-83","stallman@mail.com",encoder.encode("123"));
		Tecnico tec3 = new Tecnico(null,"Claude Elwood Shannon","870.521.230-88","shannon@mail.com",encoder.encode("123"));
		Tecnico tec4 = new Tecnico(null,"Tim Berners-Lee","030.777.020-61","lee@mail.com",encoder.encode("123"));
		Tecnico tec5 = new Tecnico(null,"Linus Torvalds","630.727.630-46","linus@mail.com",encoder.encode("123"));
		
		
		
		Cliente cli1 = new Cliente(null,"Albert Einstein","993.088.820-90","einstein@mail.com",encoder.encode("123"));
		Cliente cli2 = new Cliente(null,"Marie Curie","010.517.530-74","curie@mail.com",encoder.encode("123"));
		Cliente cli3 = new Cliente(null,"Charles Darwin","769.329.390-61","darwin@mail.com",encoder.encode("123"));
		Cliente cli4 = new Cliente(null,"Stephen Hawking","300.172.490-07","hawking@mail.com",encoder.encode("123"));
		Cliente cli5 = new Cliente(null,"Max Planck","445.439.800-34","planck@mail.com",encoder.encode("123"));
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 1", "Teste Chamado 1", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 2", "Teste Chamado 2", tec1, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 3", "Teste Chamado 3", tec2, cli3);
		Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 4", "Teste Chamado 4", tec3, cli3);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 5", "Teste Chamado 5", tec2, cli1);
		Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 6", "Teste Chamado 6", tec1, cli5);
		
		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5, cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1,c2, c3, c4, c5, c6));
	}
}
