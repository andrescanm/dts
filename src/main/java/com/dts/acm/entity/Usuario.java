package com.dts.acm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private int idUsuario;
	
	@Column(name="tipo_identificacion")
	private String tipoIdentificacion;
	
	@Column(name="numero_identificacion")
	private int numeroIdentificacion;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="departamento")
	private String departamento;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="id_empresa")
	private int idEmpresa;

	@Column(name="id_vehiculo")
	private int idVehiculo;
	
	@Column(name="es_representanteLegal")
	private byte esRepresentanteLegal;
	
	@Column(name="es_conductor")
	private byte esConductor;
	
	@Column(name="es_admin")
	private byte esAdmin;

	public Usuario() {
	}
	
	public Usuario(int idUsuario, String tipoIdentificacion, int numeroIdentificacion, String nombre, String direccion,
			String ciudad, String departamento, String pais, String telefono, int idEmpresa, byte esRepresentanteLegal,
			byte esConductor, byte esAdmin) {
		super();
		this.idUsuario = idUsuario;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.pais = pais;
		this.telefono = telefono;
		this.idEmpresa = idEmpresa;
		this.esRepresentanteLegal = esRepresentanteLegal;
		this.esConductor = esConductor;
		this.esAdmin = esAdmin;
	}

	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
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

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}
	
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public byte getEsRepresentanteLegal() {
		return esRepresentanteLegal;
	}

	public void setEsRepresentanteLegal(byte esRepresentanteLegal) {
		this.esRepresentanteLegal = esRepresentanteLegal;
	}

	public byte getEsConductor() {
		return esConductor;
	}

	public void setEsConductor(byte esConductor) {
		this.esConductor = esConductor;
	}

	public byte getEsAdmin() {
		return esAdmin;
	}

	public void setEsAdmin(byte esAdmin) {
		this.esAdmin = esAdmin;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", tipoIdentificacion=" + tipoIdentificacion
				+ ", numeroIdentificacion=" + numeroIdentificacion + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", ciudad=" + ciudad + ", departamento=" + departamento + ", pais=" + pais + ", telefono=" + telefono
				+ ", idEmpresa=" + idEmpresa + ", esRepresentanteLegal=" + esRepresentanteLegal + ", esConductor="
				+ esConductor + ", esAdmin=" + esAdmin + "]";
	}

}
