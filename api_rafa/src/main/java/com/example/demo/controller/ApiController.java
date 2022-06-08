package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Informacao;
import com.example.demo.repository.RepoInformacao;

@RestController
public class ApiController {

	@Autowired
	private RepoInformacao repoInformacao;
	
	@RequestMapping(value = "/informacoes", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Informacao incluir(@RequestBody Informacao info) {
		//return "Ok.. foi incluído com sucesso o registro "+info.getCodigo();
		return repoInformacao.save(info);
	}

	@RequestMapping(value = "/informacoes", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Informacao> listar() {
		//return repoInformacao.findAll();
		return repoInformacao.findAll();
		
	}

	@RequestMapping(value = "/inserir", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String inserir() {
		Informacao informacao = new Informacao();
		informacao.setDescricao("Primeiro Teste");
		informacao.setCodigo(32);
		incluir(informacao);
		return "Valores inseridos..............";
	}
	
	
	@RequestMapping(value = "/inserir/{id}", method = RequestMethod.POST)
	public String inserir_nome(@PathVariable("id") String id) {
	//public User getUser(@PathVariable("id") String id) {
		Informacao informacao = new Informacao();
		informacao.setDescricao(id);
		informacao.setCodigo(000);
		incluir(informacao);
		return "ok... INSERIDO UM UNICO VALOR...";
	}
	
	
	
}
