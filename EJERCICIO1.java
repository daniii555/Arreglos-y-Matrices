/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import java.util.Scanner;

/**
 * @author Danny Andres Espinoza Jimenez
 */
public class EJERCICIO1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero para la posicion " + i + ":");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("\nValores almacenados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion " + i + ":" + numeros[i]);
        }
    }
}
