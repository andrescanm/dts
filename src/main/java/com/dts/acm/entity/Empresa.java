package com.dts.acm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private int idEmpresa;

	@Column(name = "tipo_identificacion")
	private String tipoIdentificacion;

	@Column(name = "numero_identificacion")
	private int numeroNdentificacion;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "ciudad")
	private String ciudad;

	@Column(name = "departamento")
	private String departamento;

	@Column(name = "pais")
	private String pais;

	@Column(name = "telefono")
	private String telefono;

	public Empresa() {
		super();
	}

	public Empresa(int idEmpresa, String tipoIdentificacion, int numeroNdentificacion, String nombre, String direccion,
			String ciudad, String departamento, String pais, String telefono) {
		super();
		this.idEmpresa = idEmpresa;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroNdentificacion = numeroNdentificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.pais = pais;
		this.telefono = telefono;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getNumeroNdentificacion() {
		return numeroNdentificacion;
	}

	public void setNumeroNdentificacion(int numeroNdentificacion) {
		this.numeroNdentificacion = numeroNdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", tipoIdentificacion=" + tipoIdentificacion
				+ ", numeroNdentificacion=" + numeroNdentificacion + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", ciudad=" + ciudad + ", departamento=" + departamento + ", pais=" + pais + ", telefono=" + telefono
				+ "]";
	}
	
}
