package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {
        //Clase  nombreObj  = new Clase();
        Coche   coche1   =   new   Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //POLIMORFISMO
//El POLIMORIFISMO permite tratar a objetos como si fueran de la clase madre, esto sirve para tratarlos a todos por igual y es mas práctico

        //ClaseMadre nombreobj  = new ClaseObjeto();


        Coche coche4 = new CocheElectrico(); //Creo los objetos a partir de la clase madre
        Coche coche5 = new CocheHibrido();

        //instanceof permite hacer operaciones con un objeto de acuerdo a su clase




        //En este caso, se comprueba que el objeto "coche4" es instanceof la clase "CocheElectrico"
        if (coche4 instanceof CocheElectrico) {              //if (objeto instanceof ClaseDeseada(){
                                                             //            Operacion// }
            System.out.println("Es un objeto de la clase CocheElectrico");
        }


        //En este caso, se comprueba que el objeto "coche4" es instanceof la clase madre "Coche"
        if (coche4 instanceof Coche){
            System.out.println("Este es un objeto de clase Coche");
        }







    }
}
