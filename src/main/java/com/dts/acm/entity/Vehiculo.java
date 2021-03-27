package com.dts.acm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_vehiculo") 
	private int idVehiculo;
	
	@Column(name="placa") 
	private String placa; 
	
	@Column(name="motor") 
	private String motor; 
	
	@Column(name="chasis") 
	private String chasis; 
	
	@Column(name="modelo") 
	private String modelo; 
	
	@Column(name="fecha_matricula") 
	private Date fechaMatricula; 
	
	@Column(name="pasajeros_sentados") 
	private short pasajerosSentados; 
	
	@Column(name="pasajeros_pie") 
	private short pasajerosPie;
	
	@Column(name="peso_seco") 
	private String pesoSeco;
	
	@Column(name="peso_bruto") 
	private String pesoBruto;
	
	@Column(name="cantidad_puertas") 
	private short cantidadPuertas; 
	
	@Column(name="marca") 
	private String marca; 
	
	@Column(name="linea") 
	private String linea; 
	
	@Column(name="id_empresa")
	private int idEmpresa;

	public Vehiculo() {
		super();
	}

	public Vehiculo(int idVehiculo, String placa, String motor, String chasis, String modelo, Date fechaMatricula,
			short pasajerosSentados, short pasajerosPie, String pesoSeco, short pesoBruto, short cantidadPuertas,
			String marca, String linea, int idEmpresa) {
		super();
		this.idVehiculo = idVehiculo;
		this.placa = placa;
		this.motor = motor;
		this.chasis = chasis;
		this.modelo = modelo;
		this.fechaMatricula = fechaMatricula;
		this.pasajerosSentados = pasajerosSentados;
		this.pasajerosPie = pasajerosPie;
		this.pesoSeco = pesoSeco;
		this.pesoBruto = pesoBruto;
		this.cantidadPuertas = cantidadPuertas;
		this.marca = marca;
		this.linea = linea;
		this.idEmpresa = idEmpresa;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public short getPasajerosSentados() {
		return pasajerosSentados;
	}

	public void setPasajerosSentados(short pasajerosSentados) {
		this.pasajerosSentados = pasajerosSentados;
	}

	public short getPasajerosPie() {
		return pasajerosPie;
	}

	public void setPasajerosPie(short pasajerosPie) {
		this.pasajerosPie = pasajerosPie;
	}

	public String getPesoSeco() {
		return pesoSeco;
	}

	public void setPesoSeco(String pesoSeco) {
		this.pesoSeco = pesoSeco;
	}

	public String getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(String pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public short getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(short cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", placa=" + placa + ", motor=" + motor + ", chasis=" + chasis
				+ ", modelo=" + modelo + ", fechaMatricula=" + fechaMatricula + ", pasajerosSentados="
				+ pasajerosSentados + ", pasajerosPie=" + pasajerosPie + ", pesoSeco=" + pesoSeco + ", pesoBruto="
				+ pesoBruto + ", cantidadPuertas=" + cantidadPuertas + ", marca=" + marca + ", linea=" + linea
				+ ", idEmpresa=" + idEmpresa + "]";
	}
	
}
