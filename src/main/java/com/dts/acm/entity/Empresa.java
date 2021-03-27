package com.dts.acm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empresa")
@AllArgsConstructor
@Getter
@Setter
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa")
	private int idEmpresa;

	@Column(name = "tipo_identificacion")
	private int tipoIdentificacion;

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
}
