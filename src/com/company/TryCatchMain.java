package com.company;

public class TryCatchMain {
    //Manejo de excepciones (ERRORES)

    public static void main(String[] args) {


        try {
        int result = 5/0; //esto da un error ArithmeticException
        }
        catch (ArithmeticException e){ //catch(nombredelaexcepcion variableexcepcion)
            e.printStackTrace(); //variableexcepcion.printStacktrace(); sirve para que nos tire el error en la consola

        }

        finally {
            System.out.println("Problema con esta operacion, saltamos al codigo siguiente con un FINALLY");
        }


        System.out.println("Fin del programa con la excepcion controlada por TryCatchFinally");






    }
}
