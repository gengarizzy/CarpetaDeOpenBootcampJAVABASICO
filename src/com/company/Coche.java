package com.company;

public class Coche {

//Podria declararse como una clase ABSTRACTA para evitar que se instancien objetos de esta clase
// Solo se podrian instanciar objetos de sus clases hijas. Esto puede servir si la clase madre es incompleta respecto a las hijas
//public abstract ClassName {contenido}




    // ATRIBUTOS
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Double largo;
        Integer velocidad = 0;



    // CONTRUCTORES


    public Coche(){}
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){

        //this.atributo hace referencia a dicha propiedad de ese objeto
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;


    }


    // COMPORTAMIENTO (METODOS)

    @Override
    public String toString() { //Permite imprimpir por consola los objetos creados con esta clase
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }

    public void acelerar(Integer cantidad){
        if(cantidad>0 && cantidad<=120){
            this.velocidad += cantidad;
        }



    }
}
