package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

	@Entity //genera la tabla
	@Table (name = "Productos") //nombrar la tabla

public class Producto {
	
	@Id // primary key
	@GeneratedValue (strategy = GenerationType.IDENTITY) //autoincrementa
	private Long id;
	
		@Column (name = "Nombre")
	private String nombre;
	
	@Column (name = "Precio")
	public Double precio;
	
		
	private LocalDateTime createdAt;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombre, Double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}
	private Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	private void setPrecio(Double precio) {
		this.precio = precio;
	}

	
	private LocalDateTime getCreatedAt() {
		return createdAt;
	}

	private void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio
				+ ", createdAt=" + createdAt + "]";
	}
	
	

}
