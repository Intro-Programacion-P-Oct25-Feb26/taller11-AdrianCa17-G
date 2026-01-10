/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int opcion;

        System.out.println("Seleccione una de las siguientes funciones:\n1. Calcular"
                + "el valor de la planilla de luz\n2. Calcular el valor del predio"
                + "de un bien inmueble\n");

        opcion = entrada.nextInt();
        entrada.nextLine();

        if ((opcion == 1) || (opcion == 2)) {

            String nombre;
            String cedula;

            System.out.println("Ingrese su nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula: ");
            cedula = entrada.nextLine();

            if (opcion == 1) {
                valorPlanillaLuz(nombre, cedula);
            } else {
                if (opcion == 2) {
                    predioBienInmueble(nombre, cedula);
                }
            }
        } else {
            if (opcion >= 4) {
                System.out.println("Opcion Invalida");
            }
        }
    }

    public static void valorPlanillaLuz(String nombre, String cedula) {

        Scanner entrada = new Scanner(System.in);

        int valorKilowatio;
        int numeroKilowatios;
        int respuestaPlanillaLuz;

        System.out.println("Usted ha seleccionado la opcion de obtener la planilla de luz\n");
        System.out.println("Ingrese el valor de los kilowatios");
        valorKilowatio = entrada.nextInt();
        System.out.println("Ingrese el numero de kilowatios");
        numeroKilowatios = entrada.nextInt();

        respuestaPlanillaLuz = valorKilowatio * numeroKilowatios;

        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $%d\n ", nombre, cedula, respuestaPlanillaLuz);
    }

    public static void predioBienInmueble(String nombre, String cedula) {

        Scanner entrada = new Scanner(System.in);

        double valorInmueble;
        double respuestaValorInmueble;

        System.out.println("Usted ha seleccionado la opcion de Calcular el valor del predio de un bien inmueble\n");
        System.out.println("Ingrese el valor del bien inmueble");
        valorInmueble = entrada.nextDouble();

        respuestaValorInmueble = valorInmueble * 0.2;

        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble valorado en $ %.2f y tiene que pagar de predio $ %.2f\n", nombre, cedula, valorInmueble, respuestaValorInmueble);

    }
}
