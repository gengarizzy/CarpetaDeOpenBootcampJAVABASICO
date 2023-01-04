package Ejercicio2Funciones;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {


        //TOMO EL PRECIO Y EL IVA MEDIANTE LA CONSOLA
        //LUEGO GUARDO ESTOS VALORES EN precioconiva, mediante el uso de la funcion precioConIva
        //Finalizo imprimiendo un string junto al valor obtenido en la operacion anterior
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        float precio = Float.parseFloat(scanner.nextLine());
        System.out.println("Introduce el IVA");
        float iva = Float.parseFloat(scanner.nextLine());
        float precioconiva = precioConIva(precio, iva); //Invoco a la funcion que toma precio e iva, declarada mas abajo
        System.out.println("El costo total con el IVA incluido es de " +precioconiva);

        }


        //Hago una funcion con float ya que podria darse un numero con decimaless
        static float precioConIva(float precio, float iva) {

        return precio + (precio * iva / 100);
    }


















}
