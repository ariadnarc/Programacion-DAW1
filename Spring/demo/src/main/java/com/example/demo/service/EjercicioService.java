package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EjercicioService {

    public String ejercicio1() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 20; i++) {
            if (i > 1) {
                resultado.append(", ");
            }

            resultado.append(i);
        }

        resultado.append(".");

        return resultado.toString();
    }
}