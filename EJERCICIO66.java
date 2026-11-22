/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio66;
import java.util.Scanner;

/**
 * @author Danny Andres Espinoza Jimenez
 */
public class EJERCICIO66 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el valor para la fila " + i + ", columna " + j + ":");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
                if (j < 3) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
