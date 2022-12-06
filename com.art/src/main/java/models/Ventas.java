package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Ventas implements Serializable {
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "precio")
	private float precio;

	@Column(name = "cantidad")
	private int cantidad;

	public Ventas() {}
	
	public Ventas(String fecha, float precio, int cantidad) {
		super();
		this.fecha = fecha;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Ventas [id=" + id + ", fecha=" + fecha + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
