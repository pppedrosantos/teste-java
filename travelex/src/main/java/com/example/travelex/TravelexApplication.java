package com.example.travelex;

import com.example.travelex.entity.Cliente;
import com.example.travelex.entity.Robo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelexApplication {

	public static void main(String[] args) {

		String name = "Pedro dos Santos";

		Cliente cliente = new Cliente(name);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Nome completo do Cliente sem espaço: " + cliente.getName());
		System.out.println("Primeiro nome do Cliente: " + cliente.getFirstName());
		System.out.println("Sobrenome(s) do Cliente: " + cliente.getLastName());
		System.out.println("Nome completo do Cliente em letra maiuscula: " + cliente.getName().toUpperCase());
		System.out.println("Nome do Cliente abreviado: " + cliente.getAbreviateName());
		System.out.println("----------------------------------------------------------------------------------\n");

		String nameRobo = "Vitor Moraes Amazon Ferreira";

		Robo robo = new Robo(nameRobo);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Nome do Robo: " + robo.getName());
		System.out.println("Primeiro nome do Robo: " + robo.getFirstName());
		System.out.println("Sobrenome do Robo: " + robo.getLastName());
		System.out.println("Nome completo do Robo em letra maiuscula: " + robo.getName().toUpperCase());
		System.out.println("Nomedo Robo abreviado: " + robo.getAbreviateName());

		SpringApplication.run(TravelexApplication.class, args);
	}

}
