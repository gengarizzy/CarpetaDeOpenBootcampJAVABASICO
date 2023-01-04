package com.company;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        //Las LISTAS son dinamicas, se les puede agregar o quitar elementos a diferencia de un ARRAY

        //Usa los paqueres List y ArrayList
        // List<tipodedato> nombre = new ArrayList<tipodedato>();

        List<String> nombres = new ArrayList<String>();

        //con el metodo ADD podemos agregar un elemento a la lista

        nombres.add("InsertoNombre1");
        nombres.add("InsertoNombre2");
        nombres.add("InsertoNombre3");
        nombres.add("InsertoNombre4");
        nombres.add("InsertoNombre5");

        System.out.println(nombres);


        //for(tipodedato variable:nombrelista){acciones}

        for(String nombre: nombres){

            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<Coche>();
        coches.add(new CocheElectrico());
        coches.add(new CocheHibrido());
        coches.add(new Coche());


        for(Coche variable:coches){
            System.out.println(variable);
        }





    }
}
