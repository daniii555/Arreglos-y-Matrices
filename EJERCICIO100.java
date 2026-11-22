/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio100;
import java.util.Scanner;

/**
 * @author Danny Andres Espinoza Jimenez
 */
public class EJERCICIO100 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int valor;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese el valor para la fila " + i + ", columna " + j + ":");
                valor = teclado.nextInt();
                matriz[i][j] = valor + (i * j);
            }
        }

        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]);
                if (j < 4) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}