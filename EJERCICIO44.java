/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio44;

 import java.util.Scanner;

/**
 * @author Danny Andres Espinoza Jimenez
 */
public class EJERCICIO44 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[20];
        int cantPares = 0;
        int cantImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el numero entero " + (i + 1) + ":");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                cantPares = cantPares + 1;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantImpares = cantImpares + 1;
                sumaImpares = sumaImpares + numeros[i];
            }
        }

        System.out.println("Cantidad de numeros pares: " + cantPares);
        System.out.println("Cantidad de numeros impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}