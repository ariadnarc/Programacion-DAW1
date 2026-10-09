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

    public String ejercicio2() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 2; i <= 200; i += 2) {
            if (i > 2) {
                resultado.append(", ");
            }

            resultado.append(i);
        }

        resultado.append(".");
        return resultado.toString();
    }

    public String ejercicio3() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                if (!resultado.isEmpty()) {
                    resultado.append(", ");
                }

                resultado.append(i);
            }
        }

        resultado.append(".");
        return resultado.toString();
    }
}