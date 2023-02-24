package com.example.travelex.Entity;

import com.example.travelex.entity.Cliente;
import com.example.travelex.entity.Gerente;
import com.example.travelex.entity.Robo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuxTest {

    Cliente cliente = new Cliente("Pedro Henrique Sousa dos Santos");
    Gerente gerente = new Gerente("Carlos Alberto");
    Robo robo = new Robo("Watson Souza Gates");

    @Test
    @DisplayName("Nome do cliente não está Ok")
    void getNomeErrado() {
        var methodReturn = cliente.getFirstName();
        assertNotEquals("Jeff", methodReturn);
    }


    @Test
    @DisplayName("Nome abreviado tem que vir correto.")
    void getNomeAbreviado() {
        var methodReturn = cliente.getAbreviateName();
        assertEquals("Pedro H. Sousa dos Santos", methodReturn);
    }

    @Test
    void ggetNomeAbreviadoErrado() {
        var methodReturn = gerente.getAbreviateName();
        assertNotEquals("P. H. Sousa dos Santos", methodReturn);
    }

    @Test
    @DisplayName("Nome do Gerente tem que vir correto.")
    void getNomeInteiroGerente() {
        var methodReturn = gerente.getName();
        assertEquals("Carlos Alberto", methodReturn);
    }

    @Test
    @DisplayName("Nome do Gerente tem que vir correto.")
    void getNomeInteiroGerenteErrado() {
        var methodReturn = gerente.getName();
        assertNotEquals("Carlos Alberto Sousa", methodReturn);
    }

    @Test
    @DisplayName("Nome do Robo tem que vir correto")
    void getUltimoNomeRobo() {
        var methodReturn = robo.getLastName();
        assertEquals("Souza Gates", methodReturn);
    }

    @Test
    @DisplayName("Nome do Robo não está certo")
    void getUltimoNomeRoboErrado() {
        var methodReturn = robo.getLastName();
        assertNotEquals("A. Souza Gates", methodReturn);
    }

}
