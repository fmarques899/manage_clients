package com.coop.cooperforte.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="CLT")
public class Client {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="NM_CLT", nullable=false)
	private String name;
	
	@Column(name="CPF_CLT", nullable=false)
	private String cpf;
	
	
}
