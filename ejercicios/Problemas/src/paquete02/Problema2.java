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
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        datosViviendas();
        matrizConsumo();

    }

    public static String datosViviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];
        String cadena = "";
        for (int i = 0; i < viviendas.length; i++) {
            System.out.println("Ingrese el nombre de la vivienda: ");
            viviendas[i] = entrada.nextLine();
            cadena = String.format("%s%s\n", cadena, viviendas[i]);
        }
        cadena = String.format("Nombres de las 12 viviendas: \n%s", cadena);
        return cadena;
    }

    public static String matrizConsumo() {
        Scanner entrada = new Scanner(System.in);
        String[][] consumoElectrico = new String[10][12];
        String cadena = "";
        for (int i = 0; i < consumoElectrico.length; i++) {
            for (int j = 0; j < consumoElectrico[i].length; j++) {
                System.out.println("Ingrese el consumo electrico de la vivienda: ");
                consumoElectrico[i][j] = entrada.nextLine();
                cadena = String.format("%s%s\n", cadena, consumoElectrico[i][j]);
            }

        }
        cadena = String.format("Consumo electrico de las 12 viviendas: \n%s", cadena);
        return cadena;
    }
    
    public static int consumoAnual() {
        int[][] consumoElectricoAnual = new int[12];
        String cadena = "";
        int sumaTotal;
        for (int i = 0; i < consumoElectricoAnual.length; i++) {
                sumaTotal = sumaTotal + consumoElectrico[i][j];
                cadena = String.format("%s%s\n", cadena, consumoElectrico[i][j]);
        }
        cadena = String.format("Consumo electrico de las 12 viviendas: \n%s", cadena);
        return cadena;
    }
}
