/**
 * @file app.js
 * @description Funciones de los ejercicios.
 */

function ejercicio1() {
    let resultado = "";

    for (let i = 1; i <= 20; i++) {
        if (i === 20) {
            resultado += i + ".";
        } else {
            resultado += i + ", ";
        }
    }

    document.getElementById("resultado").textContent = resultado;
}