package com.TiendagenericaGr05.Backendtiendagenerica.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedores {
	@Id
	private Long nitproveedor;
	private String ciudad_proveedor;
	private String direccion_proveedor;
	private String nombre_proveedor;
	private Long telefono_proveedor;
	public Long getNitproveedor() {
		return nitproveedor;
	}
	public void setNitproveedor(Long nitproveedor) {
		this.nitproveedor = nitproveedor;
	}
	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}
	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}
	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public Long getTelefono_proveedor() {
		return telefono_proveedor;
	}
	public void setTelefono_proveedor(Long telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	
	
	

}
