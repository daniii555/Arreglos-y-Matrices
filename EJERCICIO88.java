/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio88;
import java.util.Scanner;

/**
 * @author Danny Andres Espinoza Jimenez
 */
public class EJERCICIO88 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el valor para la fila " + i + ", columna " + j + ":");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("\nElementos de la diagonal principal:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.println("Posicion [" + i + "][" + j + "]: " + matriz[i][j]);
                    sumaDiagonal = sumaDiagonal + matriz[i][j];
                }
            }
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}
