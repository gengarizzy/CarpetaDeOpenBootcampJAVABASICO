package com.company;

import org.w3c.dom.ls.LSOutput;

public class ArraysMain {

    public static void main(String[] args) {

        // Los ARRAYS son estaticos, no se les puede agregar elementos, a diferencia de las LISTAS


//Puedo declarar un array con una longitud determinada como en el primer caso, o uno sin longitud determinada y los elementos cargados en el otro

        // Tipo-Clase[] nombreArray = new Tipo-Clase[longitud];

        // Tipo-Clase[] nombreArray = new Tipo-Clase[]{elemento0, elemento1, elemento2, elemento3, elemento4, etc};


        String[] stringArray = new String[5]; // ARRAY DE STRING con 5 elementos

        int[] intArray = new int[5]; // Array de int con 5 elementos


        String yorick = "Yorick";
        String nasus = "Nasus";
        String shen = "Shen";

        String[] ac = new String[]{yorick, nasus, shen};

        //  nombreArray[posicion] = nombreElemento;


        System.out.println(ac.length);

        for (int i = 0; i < ac.length; i++) {
            System.out.println(ac[i]);

        }
    }
}
