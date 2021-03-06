package com.TiendagenericaGr05.Backendtiendagenerica.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {
	@Id	
	private Long codigo_producto;
	private Long iva_compra;
	private Long nitproveedor;
	private String nombre_producto;
	private Long precio_compra;
	private Long precio_venta;
	public Long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public Long getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(Long iva_compra) {
		this.iva_compra = iva_compra;
	}
	public Long getNitproveedor() {
		return nitproveedor;
	}
	public void setNitproveedor(Long nitproveedor) {
		this.nitproveedor = nitproveedor;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public Long getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(Long precio_compra) {
		this.precio_compra = precio_compra;
	}
	public Long getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(Long precio_venta) {
		this.precio_venta = precio_venta;
	}
	
}
