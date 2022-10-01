package crudapibackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crudapibackend.entity.Empleado;

@Repository
public interface EmpleadoRepository  extends JpaRepository<Empleado, Long>{

}
