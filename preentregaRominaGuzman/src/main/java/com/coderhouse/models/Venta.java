package com.coderhouse.models;

import java.util.List;

public class Venta {
 
	private Cliente cliente;
	private List <Producto> productos;
	
	public Venta (Cliente cliente, List <Producto> productos) {
		
		this.cliente = cliente;
		this.productos = productos;
		
		
	}

	private Cliente getCliente() {
		return cliente;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private List<Producto> getProductos() {
		return productos;
	}
	
		
	private void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	 public double calcularTotal() {
	        double total = 0;
	        for (Producto producto : productos) {
	            total += producto.getPrecio();
	        }
	        return total;
	  }
	 
	
	@Override
	public String toString() {
		return "Venta [cliente=" + cliente + ", productos=" + productos + " + Total = total]";
	}
}
