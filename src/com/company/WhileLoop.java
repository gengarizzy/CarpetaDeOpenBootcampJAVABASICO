package com.company;

public class WhileLoop {

    public static void main(String[] args) {




        int count = 0;

        while(count<10){  //while(condicion){ contenido } Mientras la condicion sea verdadera, entonces hacer {contenido}


            count++;

        // Se pueden combinar con estructuras de control como el IF

            if(count==6){ //SI se cumple esa condicion, se salta el codigo siguiente (en este caso, el println con el valor de count==6 )
                // continue; //CONTINUE hace que se salte el codigo siguiente al cumplir una condicion

               break;   //BREAK hace que el bucle se termine, por ejemplo, al encontrar un valor deseado
            }

            System.out.println("Hola mundo, este count es el numero " + count);


        }

        System.out.println("Se ha llegado al maximo valor de count determinado por nuestra condicion. FIN");

    }
}
