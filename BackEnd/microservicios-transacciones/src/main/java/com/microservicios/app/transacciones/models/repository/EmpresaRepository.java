package com.microservicios.app.transacciones.models.repository;

import org.springframework.data.repository.CrudRepository;

//import com.microservicios.commons.transacciones.models.entity.Empresa;
import  com.microservicios.app.transacciones.entity.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}
