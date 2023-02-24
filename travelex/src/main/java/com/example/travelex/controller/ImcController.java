package com.example.travelex.controller;

import com.example.travelex.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc")
public class ImcController {

    //endpoint do serviço: http://localhost:8080/imc?weight=75.0&height=175.0

    @Autowired
    private ImcService imcService;

    @GetMapping
    public ResponseEntity<Double> getIMC(@RequestParam(value = "weight") Double weight,
                                         @RequestParam(value = "height") Double height) {
        //Validação para altura e peso
        if (weight <= 0 || height <= 0) {
            return new ResponseEntity<>(0.00, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(imcService.getIMC(weight, height), HttpStatus.OK);
    }

}
