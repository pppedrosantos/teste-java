package com.example.travelex.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.text.DecimalFormat;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = IMCServiceTest.class)
class IMCServiceTest {

        ImcService service = new ImcService();

        DecimalFormat df = new DecimalFormat("0.00");

        @Test
        @DisplayName("Se resultado Ok, teste passa.")
        void getRetornoStatus() {
           assertEquals(df.format(21.37), df.format(service.getIMC(70.0, 1.81 )));
        }

        @Test
        @DisplayName("Se resultado NOk, teste passa.")
        void getResultadoErrado() {
            assertNotEquals(df.format(21.37), df.format(service.getIMC(70.0, 1.87 )));
        }
}
