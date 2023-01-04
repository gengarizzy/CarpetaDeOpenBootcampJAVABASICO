package com.company;

public class Funciones {

    public static void main(String[] args) {

        
        holaMundo();
        holaMundo("Nekinu");
        String hola = devolverHola();
        System.out.println(hola);
    }

    // MODIFICADOR DE VISIBILIDAD=Public-private-protected    static   tipodedato-void  nombreFuncion(parametros) {implementation}


    private static void holaMundo() { //ASIGNATURA DE LA FUNCION. Declara identificador, modificadores y parametros
        System.out.println("Hola Mundo"); // IMPLEMENTACION o CUERPO de la funcion

    }

    private static void holaMundo(String name) {
        System.out.println("Hola "+ name);

    }

    private static String devolverHola(){
        return "Devolver texto";
    }
}

/* SOBRECARGA DE FUNCIONES, son funciones con su nombre duplicado, pero sin repetir los parametros
*
* */
