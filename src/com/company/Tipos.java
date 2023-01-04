package com.company;

public class Tipos {

    public static void main(String[] args) {


        // TIPO IDENTIFICADOR = VALOR; (Estoy declarando e iniciando la variable de tipo TIPO y nombre IDENTIFICADOR)
        // TIPO IDENTIFICADOR; (Declaro la variable de nombre IDENTIFICADOR pero no la inicio)
        // IDENTIFICADOR = VALOR; (Inicio la variable de nombre IDENTIFICADOR que había declarado previamente


        // ENTEROS (primitivo)
        byte number1 = 1;// 1 byte
        short number2 = 2;  //2 byte
        int number3 = 3;  //4 byte
        long number4 = 4;   //8 byte


        // PUNTO FLOTANTE (primitivo)
        float decimal1= 4.9f;
        double decimal2= 9.99d;


        // CARACTER (primitivo)
        char caracter1 = 'a'; // La comilla simple ' ' se hace con ALT 39


        // BOOLEANOS (primitivo)
        boolean verdadero = true;
        boolean falso = false;


        // CADENAS DE TEXTO (Tipo de clase, NO PRIMITIVO. Puede ser nulo)
        String nombre = "Nombre";
        String apellido = "Apellido";


        // TIPOS ENVOLTORIO (Envuelve a los tipos primitivos y les permite tener un valor nulo)
        Integer numero = null;
        Long numero2 = 2L;



    }
}
