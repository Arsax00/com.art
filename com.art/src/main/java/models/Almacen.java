package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "almacen")

public class Almacen implements Serializable {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "cantidad")
	private int cantidad;

	@Column(name = "precio_compra")
	private float precio_compra;

	@Column(name = "precio_venta")
	private float precio_venta;

	public Almacen(String nombre, int cantidad, int pCompra, int pVenta) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio_compra = pCompra;
		this.precio_venta = pVenta;
	}

	@Override
	public String toString() {
		return "Almacen [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio_compra="
				+ precio_compra + ", precio_venta=" + precio_venta + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(float precio_compra) {
		this.precio_compra = precio_compra;
	}

	public float getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}

}
