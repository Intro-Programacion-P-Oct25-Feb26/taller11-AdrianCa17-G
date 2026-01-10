/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double mensajeMediaArimetica = mediaArimetica(informacion);
        double mensajeDesviacionEstandar = desviacionEstandar(informacion,  mensajeMediaArimetica);
        System.out.println("La media arimetica del arreglo es: " + mensajeMediaArimetica);
        System.out.println("La desviacion estandar del arreglo es: " + mensajeDesviacionEstandar);
    }

    public static double mediaArimetica(int[] arreglo1) {

        double suma = 0;
        double mediaArimetica2;

        for (int i = 0; i < arreglo1.length; i++) {
            suma = suma + arreglo1[i];
        }
        mediaArimetica2 = suma / arreglo1.length;
        return mediaArimetica2;
    }
    
     public static double desviacionEstandar(int[] arreglo1, double mediaArimetica) {

        double suma = 0;
        double respuestaDesviacionEstandar;

        for (int i = 0; i < arreglo1.length; i++) {
            suma = suma + Math.pow(arreglo1[i] - mediaArimetica, 2);
        }
        respuestaDesviacionEstandar = Math.sqrt(suma/arreglo1.length);
        return respuestaDesviacionEstandar;
    }

}
