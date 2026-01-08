/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] viviendas = datosViviendas();
        double[][] consumoElectrico = matrizConsumo();
        double[] consumoAnual = consumoAnual(consumoElectrico);

        reporteFinal(viviendas, consumoAnual);

    }

    public static String[] datosViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];

        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Ingrese el nombre de la vivienda: ");
            viviendas[i] = entrada.nextLine();
        }

        return viviendas;
    }

    public static double[][] matrizConsumo() {
        Scanner entrada = new Scanner(System.in);
        double[][] consumoElectrico = new double[10][12];
        for (int i = 0; i < consumoElectrico.length; i++) {
            System.out.println("Vivienda " +(i + 1)+":\n");
            for (int j = 0; j < consumoElectrico[i].length; j++) {
                System.out.printf("Ingrese el consumo electrico de la vivienda en el mes %d: ", j + 1);
                consumoElectrico[i][j] = entrada.nextDouble();
            }

        }
        return consumoElectrico;
    }

    public static double[] consumoAnual(double[][] consumoElectrico) {
        double[] consumoAnual = new double[12];
        for (int i = 0; i < consumoElectrico.length; i++) {
            double sumaTotal = 0;
            for (int j = 0; j < consumoElectrico[i].length; j++) {
                sumaTotal = sumaTotal + consumoElectrico[i][j];
            }
            consumoAnual[i] = sumaTotal;
        }
        return consumoAnual;
    }

    public static void reporteFinal(String[] viviendas, double[] consumoAnual) {
        String cadena = "\nReporte anual de consumo electrico de las viviendas";
        for (int i = 0; i < viviendas.length;i++) {
        
                cadena = String.format("\n%sVivienda: %s - Consumo Anual: %.0f\n", cadena, viviendas[i], consumoAnual[i]);
        }
        System.out.println(cadena);
    }
}
