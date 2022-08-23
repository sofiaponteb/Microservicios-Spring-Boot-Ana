package com.microservicios.app.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.microservicios.app.empresa.entity"}) //com.microservicios.commons.transacciones.models.entity
public class MicroserviciosEmpresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosEmpresaApplication.class, args);
	}

}
