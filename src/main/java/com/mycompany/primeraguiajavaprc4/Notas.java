/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.primeraguiajavaprc4;

import java.util.Scanner;

/**
 *
 * @author Christofer
 */
public class Notas {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        double nota1;
        System.out.print("Ingrese nota del alumno:");
        nota1 = teclado.nextDouble();
        if (nota1>=7d && nota1<=10d) {
            System.out.print("Aprobado");
        } else {
            if (nota1>=6.50d && nota1<=6.99d) {
                System.out.print("Puede realizar examen de recuperacion");
            }  else {
                    if (nota1>=0d && nota1<=6.49 ) {
                        System.out.print("Reprobado");
                    }
                }
            }
        }
    }
