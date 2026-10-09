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

function ejercicio2(){
    let resultado = "";

    for (let i = 2; i <= 200; i+= 2){
        if (i == 200) resultado += i + ".";
        else resultado += i + ", ";
    }

    document.getElementById("resultado").textContent = resultado;
}

function ejercicio3(){
    let resultado = "";

    for (let i = 1; i <= 200; i++){
        if(i % 2 == 0){
            if (i == 200) resultado += i + ".";
            else resultado += i + ", ";
        }
    }

    document.getElementById("resultado").textContent = resultado;
}