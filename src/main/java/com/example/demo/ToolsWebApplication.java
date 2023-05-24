package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Clase ToolsWebAplication que ejecuta la aplicacion
 */
@SpringBootApplication
@ComponentScan("com.example.demo.Entities")
@ComponentScan("com.example.demo.Controllers")
@EnableJpaRepositories({"com.example.demo.Repositories"})
public class ToolsWebApplication {
	/**
	 * metodo para ejecutar la aplicacion
	 * @param args - argumentos del metodo
	 */
	public static void main(String[] args) {
		SpringApplication.run(ToolsWebApplication.class, args);
	}

}
