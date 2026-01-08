/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int opcion;

        System.out.println("Seleccione una de las siguientes funciones:\n1. Calcular"
                + "area del cuadrado\n2. Calcular area del triangulo\n3. Calcular area"
                + "del rectangulo\n");

        opcion = entrada.nextInt();

        if ((opcion >= 1) || (opcion <= 3)) {
            if (opcion == 1) {
                obtenerAreaCuadrado();
            } else {
                if (opcion == 2) {
                    obtenerAreaTriangulo();
                } else {
                    if (opcion == 3) {
                        obtenerAreaRectangulo();
                    }else{
                        System.out.println("Opcion Invalida");
                    }
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {

        Scanner entrada = new Scanner(System.in);

        int lado;
        int respuestaAreaCuadrado;

        System.out.println("Usted ha seleccionado obtener area del cuadrado\n");
        System.out.println("Ingrese cuanto mide el lado del triangulo");
        lado = entrada.nextInt();
        respuestaAreaCuadrado = lado * 4;
        
        System.out.println("El area del cuadrado es de: " + respuestaAreaCuadrado);
    }

    public static void obtenerAreaTriangulo() {

        Scanner entrada = new Scanner(System.in);

        int base;
        int altura;
        int respuestaAreaTriangulo;

        System.out.println("Usted ha seleccionado obtener area del triangulo\n");
        
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextInt();
        
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextInt();
        
        respuestaAreaTriangulo = (base * altura)/2;
        
        
        System.out.println("El area del triangulo es de: " + respuestaAreaTriangulo);
    }
    
    public static void obtenerAreaRectangulo() {

        Scanner entrada = new Scanner(System.in);

        int base;
        int altura;
        int respuestaAreaRectangulo;

        System.out.println("Usted ha seleccionado obtener area del triangulo\n");
        
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextInt();
        
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextInt();
        
        respuestaAreaRectangulo = base * altura;
        
        
        System.out.println("El area del rectangulo es de: " + respuestaAreaRectangulo);

    }

}
