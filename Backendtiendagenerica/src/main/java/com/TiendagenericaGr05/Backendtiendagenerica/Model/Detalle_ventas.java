package com.TiendagenericaGr05.Backendtiendagenerica.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Detalle_ventas {
@Id	
	private Long codigo_detalle_venta;
	private Long cantidad_producto;
	private Long codigo_producto;
	private Long codigo_venta;
	private Long valor_total;
	private Long valor_venta;
	private Long valoriva;
	public Long getCodigo_detalle_venta() {
		return codigo_detalle_venta;
	}
	public void setCodigo_detalle_venta(Long codigo_detalle_venta) {
		this.codigo_detalle_venta = codigo_detalle_venta;
	}
	public Long getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(Long cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public Long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public Long getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(Long codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public Long getValor_total() {
		return valor_total;
	}
	public void setValor_total(Long valor_total) {
		this.valor_total = valor_total;
	}
	public Long getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(Long valor_venta) {
		this.valor_venta = valor_venta;
	}
	public Long getValoriva() {
		return valoriva;
	}
	public void setValoriva(Long valoriva) {
		this.valoriva = valoriva;
	}
	

}
