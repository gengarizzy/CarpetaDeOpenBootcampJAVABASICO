package com.company;

public class CocheElectrico extends Coche{ //con EXTENDS heredamos una clase y agrega caracteristicas

    String motorElectrico;

    public CocheElectrico(){}

   public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo,String motorElectrico ){

        // SUPER sirve para reutilizar codigo, permite invocar a un constructor de la clase superior

       super(color, fabricante, modelo, peso, largo); //super esta invocando a esos parametros que posee un constructor de la clase superior
       this.motorElectrico = motorElectrico;
   }

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }
    @Override // SOBREESCRITURA. Indica al compilador que compruebe si exsite el método acelerar en la clase superior
    public void acelerar(Integer cantidad)  {
        Integer cantidadAjustada = cantidad*2; //HAGO UNA MODIFICACION
        super.acelerar(cantidadAjustada); //con SUPER accede al super.método de la clase superior
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
