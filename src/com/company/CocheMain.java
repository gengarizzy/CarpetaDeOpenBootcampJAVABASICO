package com.company;

public class CocheMain {

    public static void main(String[] args) {


        String coche = "alfa romeo";
        Coche cocheObj = new Coche(); // Clase nombredelobjeto = new Clase(atributos);
        Coche cocheObj2 = new Coche("rojo","Honda","civic",1430.45,5.4);
        //Crear OBJETO de una clase == Crear una INSTANCIA de la clase



        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico   = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo Motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2= new CocheElectrico("azul", "alfa", "romeo", 1500d, 4.99, "TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50); //ESTA ACCEDIENDO AL METODO SOBREESCRITO Y MODIFICADO acelerar
        //Tomado desde una clase hija, sobreescrito con @Override y modificado

        System.out.println(cocheElectrico2);


   }
}
