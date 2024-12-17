package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity //genera la tabla
@Table (name = "Clientes") //nombrar la tabla
public class Cliente {
	
	@Id // primary key
	@GeneratedValue (strategy = GenerationType.IDENTITY) //autoincrementa
	@Column (name = "N° de Cliente")
	private Long numcliente;
	
	@Column (name = "Nombre")
	private String nombre;

	@Column (name = "Apellido")
	private String apellido;

	@Column (name = "CUIL", unique = true, nullable = false) //único, no nulo
	private Long cuil;
	
	@Column (name = "Domicilio")
	private String domicilio;
	
	@Column (name = "Contacto")
	private  Long teléfono;
	
	@ManyToMany (fetch = FetchType.EAGER)
	@JoinTable (
			name = "Cliente-Producto", 
			joinColumns = @JoinColumn (name= "N° de Cliente"),
	        inverseJoinColumns = @JoinColumn (name = "Id Producto")
	)
	private List <Cliente> clientes = new ArrayList<>();

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nombre, String apellido, Long cuil, String domicilio, Long teléfono) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.domicilio = domicilio;
		this.teléfono = teléfono;
		
	}

	private Long getNumcliente() {
		return numcliente;
	}

	private void setNumcliente(Long numcliente) {
		this.numcliente = numcliente;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private Long getCuil() {
		return cuil;
	}

	private void setCuil(Long cuil) {
		this.cuil = cuil;
	}

	private String getDomicilio() {
		return domicilio;
	}

	private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	private List<Cliente> getClientes() {
		return clientes;
	}

	private void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	
	private Long getTeléfono() {
		return teléfono;
	}

	private void setTeléfono(Long teléfono) {
		this.teléfono = teléfono;
	}

	@Override
	public String toString() {
		return "Cliente [numcliente=" + numcliente + ", nombre=" + nombre + ", apellido=" + apellido + ", cuil=" + cuil
				+ ", domicilio=" + domicilio + ", teléfono=" + teléfono + ", clientes=" + clientes + "]";
	}

	
	
	
}
