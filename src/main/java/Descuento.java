
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Christofer
 */
public class Descuento {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bola;
        double monto_de_compra, descuento, importe_de_la_compra;
        Random rand = new Random();
        System.out.print("Ingresa el valor de importe de la compra: ");
        importe_de_la_compra = in.nextDouble();
        in.nextLine();
        descuento = 0;
        bola = rand.nextInt(3);
        if (bola == 0) {
            System.out.println("Bolita blanca.");
        }
        if (bola == 1) {
            descuento = importe_de_la_compra * 0.5;
            System.out.println("Bolita verde.");
        }
        if (bola == 2) {
            descuento = importe_de_la_compra * 0.10;
            System.out.println("Bolita roja.");
        }
        monto_de_compra = importe_de_la_compra - descuento;
        System.out.println("Valor de bolita: " + bola);
        System.out.println("Cantidad a pagar: " + monto_de_compra);
        System.out.println("Descuento: " + descuento);
    }

}
