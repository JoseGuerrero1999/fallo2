package crudapibackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crudapibackend.entity.Empleado;
import crudapibackend.repository.EmpleadoRepository;

@RestController
@RequestMapping("/api/")
public class EmpleadoController {

	@Autowired
	private EmpleadoRepository emplorepo;
	@GetMapping("/empleados")
	public List<Empleado> lstaempleadro(){
		return emplorepo.findAll();
	}
}
