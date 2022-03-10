package com.pjem.pessoas.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import lombok.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoas")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pessoa;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private int numero;
	
	private String complemento;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String uf;

	private LocalDate aniversario;
	
	@Column(nullable = false)
	private LocalDate  cadastro;
	
	@Column(nullable = false, unique = true)
	private String cpf;

	@OneToMany(fetch = FetchType.LAZY,
			    cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) // define em quais situações será utlizado
	 private List<Phone> Telefone = new ArrayList<>(); // cria uma lista telefone através da classe Telefone
}
