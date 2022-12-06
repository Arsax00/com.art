package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")

public class Clientes implements Serializable {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "telefono")
	private int telefono;

	@Column(name = "email")
	private String email;

	@Column(name = "web")
	private String web;

	@Column(name = "fax")
	private int fax;

	@Column(name = "observaciones")
	private String observaciones;

	public Clientes() {}
	
	public Clientes(String id, String nombre, String apellidos, String dir, int telf, String email, String web,
			int fax, String observaciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = dir;
		this.telefono = telf;
		this.email = email;
		this.web = web;
		this.fax = fax;
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + ", web=" + web + ", fax=" + fax + ", observaciones="
				+ observaciones + "]";
	}

	public int getId() {
		return cif;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
