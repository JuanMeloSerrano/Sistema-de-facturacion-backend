package com.sitiapp.backend.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotEmpty;
import org.springframework.lang.NonNull;
import javax.validation.constraints.Size;
//import javax.validation.constraints.*;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "No puede estar vacio")
	@Size(min = 4, max = 15, message = "el tamaño tiene que estar entre 4 y 15")
	@Column(name = "nombre", length =100, nullable = false)
	private String nombre;
	
	@NotEmpty(message = "No puede estar vacio")
	@Column(name = "apellido", length =100)
	private String apellido;
	
	@NotEmpty(message = "No puede estar vacio")
	@Column(name = "email", length =100, nullable = false, unique = false)
	private String email;
	
	@NonNull
	@Column(name = "create_at", length =100)	
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	/*
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	/**
	
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
