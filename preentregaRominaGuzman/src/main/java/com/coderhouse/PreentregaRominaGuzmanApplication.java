package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;

@SpringBootApplication
public class PreentregaRominaGuzmanApplication implements CommandLineRunner {
	
	@Autowired //inyecta una clase dentro de otra
	private DaoFactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(PreentregaRominaGuzmanApplication.class, args);
	}
	
   @Override 
   public void run(String...args) throws Exception {
	   
	   try {
		   Producto producto1 = new Producto ("Nueces", 8500.5);
		   Producto producto2 = new Producto ("Almendras", 7800.0);
		   Producto producto3 = new Producto ("Avellanas", 10900.8);
		   Producto producto4 = new Producto ("Pistacho", 12500.7);
		   
	   
		   Cliente cliente1 = new Cliente ("Juan", "Nuñez", 2729557938L, "Necochea 331 - Guaymallén - Mendoza", 2616245545L);
		   Cliente cliente2 = new Cliente ("Trinidad", "Guzmán", 2719557930L, "Alvear 351 - Godoy Cruz - Mendoza", 2616452587L);
		   Cliente cliente3 = new Cliente ("Emanuel", "Vera", 2028557936L, "Mitre 50 - Maipú - Mendoza", 2615948875L);
		   Cliente cliente4 = new Cliente ("Esteban", "Gomez", 2729654938L, "San Martín 1234 - Guaymallén - Mendoza", 2615948455L);
		   
		   dao.persistirCliente(cliente1);
		   dao.persistirCliente(cliente2);
		   dao.persistirCliente(cliente3);
		   dao.persistirCliente(cliente4);
		   
		   dao.persistirProducto(producto1);
		   dao.persistirProducto(producto2);
		   dao.persistirProducto(producto3);
		   dao.persistirProducto(producto4);
		   
		   List productos = new ArrayList<Producto>();
		   productos.add(producto1);
		   productos.add(producto2);
		   productos.add(producto3);
		   Venta venta1 = new Venta (cliente1, productos);
		   Double precioventa = venta1.calcularTotal();
		   
		   System.out.println(venta1.toString());
		   System.out.println(precioventa);
		   		   
   } catch (Exception e) {
	  e.printStackTrace (System.err);
   }
   }
}
