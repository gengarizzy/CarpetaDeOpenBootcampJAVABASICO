package com.company;

public class StringMain {

    public static void main(String[] args) {
        /* MÉTODOS DE LA CLASE STRING

        length() --> sirve para contar la cantidad de caracteres de un string
        startsWith(") --> sirve para
        endsWith(") --> sirve para
        indexOf(") --> sirve para
        substring(") --> sirve para
        trim() --> sirve para
        equals() --> sirve para
        compareTo(") --> sirve para

   */

        String mensaje = "       Vaaaamooo Niuuuubeeee           ";

        System.out.println(mensaje.length());

        String mensajeMAYUS = mensaje.toUpperCase();

        System.out.println(mensajeMAYUS);
        System.out.println(mensajeMAYUS.trim()); //trim quita los espacios antes y despues del contenido del string


        //equals()

        String texto1= "Soy el texto 1";
        String texto1mayus = texto1.toUpperCase();

        if(texto1mayus.equals(texto1)){
            System.out.println("texto1 y texto1mayus son iguales");
        } else if (texto1mayus.equalsIgnoreCase(texto1)) {
            System.out.println("Son iguales pero uno está en mayúsculas");

        } else {
            System.out.println("son diferentes");
        }




    }
}
