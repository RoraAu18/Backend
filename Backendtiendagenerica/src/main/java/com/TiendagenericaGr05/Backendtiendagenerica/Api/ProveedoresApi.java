package com.TiendagenericaGr05.Backendtiendagenerica.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TiendagenericaGr05.Backendtiendagenerica.DAO.ProveedoresDAO;
import com.TiendagenericaGr05.Backendtiendagenerica.Model.Proveedores;

@RestController //esta es una clase REST
@RequestMapping("Proveedores")
public class ProveedoresApi {
	
	@Autowired //inyecta la dependencia de todos los métodos del JPA para ProveedoresDAO
	private ProveedoresDAO proveedoresDAO;
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Proveedores proveedores ) {
		proveedoresDAO.save(proveedores);
	}
	
	@GetMapping("/listar")
	public List<Proveedores> listar(){
	return proveedoresDAO.findAll();
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") long id) {
		proveedoresDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Proveedores usuarios) {
		proveedoresDAO.save(usuarios);
	}
	
	
	
	
	
	

}
