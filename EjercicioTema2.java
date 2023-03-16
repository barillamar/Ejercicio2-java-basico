package com.ejercicios;

import java.text.DecimalFormat;

public class EjercicioTema2 {
    // Ejercicio: Crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static void main(String[] args) {

        double precio = getPrecio(9.99);

        DecimalFormat df = new DecimalFormat("#.##"); //Limitar el número de decimales a dos.
        String resultado = df.format(precio);

        System.out.println("El precio de este producto mas el IVA es de " + resultado + "$");


    }
    public static double getPrecio(double price) {
        return price * 1.21;
    }
}
