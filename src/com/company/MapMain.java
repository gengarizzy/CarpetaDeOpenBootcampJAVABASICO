package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        //un MAP trabaja con Clave:VALOR

        // Map<datoclave, datovalor> nombre = new HashMap<>();

        Map<String, String> personas = new HashMap<>();

        // con el metodo PUT le agrego info  nombremap.put("clave", "valor")

        personas.put("DNI: 32222111", "NOMBRE: Lagorda1");
        personas.put("DNI: 32222112", "NOMBRE: Lagorda2");
        personas.put("DNI: 32222113", "NOMBRE: Lagorda3");

        System.out.println(personas);

        for(String key : personas.keySet()){ //nombremap.keySet() sirva para obtener las claves
            System.out.println(key);
        }

        for(String value: personas.values()){ //nombremap.values() sirva para obtener los valores
            System.out.println(value);
        }



        for(Map.Entry<String, String> pair : personas.entrySet()){ //Con Map.Entry obtenemos el par clave:valor

            System.out.println(pair.getKey() + " " + pair.getValue());

        }

    }
}
