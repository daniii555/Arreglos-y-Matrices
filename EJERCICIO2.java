/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;

/**
 * @author Danny Andres Espinoza Jimenez
 */
public class EJERCICIO2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero real " + (i + 1) + ":");
            numeros[i] = teclado.nextDouble();
            suma = suma + numeros[i];
        }

        promedio = suma / 10;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
