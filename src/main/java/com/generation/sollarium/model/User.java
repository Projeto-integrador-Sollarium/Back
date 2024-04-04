package com.generation.sollarium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 2, max = 255, message = "O atributo nome deve conter no mímino 3 e no máximo 1000 caracteres.")
    private String name;
	
	@NotBlank 
	@Size(min = 2, max = 255, message = "O atributo email deve conter no mímino 3 e no máximo 1000 caracteres.")
    private String email;
	
	@NotBlank 
	@Size(min = 6, max = 255, message = "O atributo password deve conter no mímino 3 e no máximo 1000 caracteres.")
    private String password;
	
	@NotBlank 
	@Size(min = 5, max = 255, message = "O atributo address deve conter no mímino 3 e no máximo 1000 caracteres.")
    private String address; 
	
    private String phone;
    
    private String photo;
    
    
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
    
    
}
