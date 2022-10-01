package crudapibackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// nose porque usa long
	private long  id ;
	
	@Column(name = "nombre" , length = 60 , nullable = false)
	private String nombre ;
	@Column(name = "apellido",length = 60 , nullable = false)
	private String apellido ;
	//que el correo sea unico
	@Column(name = "email" , length = 60 , nullable = false , unique = true)
	private String email ;
	
}
