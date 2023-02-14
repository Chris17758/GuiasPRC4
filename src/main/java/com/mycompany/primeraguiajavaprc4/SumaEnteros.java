/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeraguiajavaprc4;

import javax.swing.JOptionPane;

/**
 *
 * @author Christofer
 */
public class SumaEnteros {

    public static void main(String[] args) {
        try {

            String primernumero;
            String segundonumero;

            int numero1;
            int numero2;
            int suma;
            primernumero = JOptionPane.showInputDialog("Digite el primer numero");
            segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
            numero1 = Integer.parseInt(primernumero);
            numero2 = Integer.parseInt(segundonumero);
            if (numero1 < 0 && numero2 < 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Numero negativo invalido");

                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma es:"
                        + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numero negativo invalido" + e);
        }
        System.exit(0);
    }
}
