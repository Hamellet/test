package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // isso vem do lombok... não preciso colocar put get etc..
@Entity // para o banco vai ser uma entidade.... esta classe..
public class Informacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(nullable = false)
	Integer codigo;
	
	@Column(nullable = false)
	String descricao;
	
}
