/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio55;

import java.util.Scanner;

/**
 * @author Danny Andres Espinoza Jimenez
 */
public class EJERCICIO55 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[12];
        int valor;

        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese un numero positivo para la posicion " + i + ":");
            valor = teclado.nextInt();

            while (valor <= 0) {
                System.out.println("Error: el numero debe ser positivo. Ingrese nuevamente para la posicion " + i + ":");
                valor = teclado.nextInt();
            }

            numeros[i] = valor + i;
        }

        System.out.println("\nValores almacenados en el arreglo:");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}