package com.example.travelex.service;

import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public Double getIMC(Double weight, Double height) {
        return weight/Math.pow(height, 2);
    }
}
