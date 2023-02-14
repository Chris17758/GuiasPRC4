
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Christofer
 */
public class Ejemplo9 {

    public static void main(String[] args) {
// TODO code application logic here
        String leer;
        double sueldo, mayor = 0, menor = 10000;
        int i = 1, contador = 0;
        while (i <= 5) {
            leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);
            sueldo = Double.parseDouble(leer);
            if (sueldo > 300) {
                contador = contador + 1;
            }
            if (sueldo > mayor) {
                mayor = sueldo;
            }
            if (sueldo < menor) {
                menor = sueldo;
            }
                if (sueldo <= -1) {
                }
                else {
                JOptionPane.showMessageDialog(null, "Numero negativo invalido");
            }
            i = i + 1;
        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor
                + "\nEl sueldo Menor es de $: " + menor
                + "\n" + contador + " Empleados tienen un sueldo mayor de $300");
    }
}
