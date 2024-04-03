package com.generation.sollarium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank(message = "O Atributo nome é obrigatório.")
	@Size(min = 3, max = 255, message = "O atributo nome deve conter no mínimo 3 e no máximo 255 caracteres.")
	private String name;
	
	@NotBlank(message = "O Atributo descrição é obrigatório.")
	@Size(min = 3, max = 1000, message = "O atributo descrição deve conter no mímino 3 e no máximo 1000 caracteres.")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
