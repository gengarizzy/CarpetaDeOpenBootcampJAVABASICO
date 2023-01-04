package com.company;

public class ForLoop {
    public static void main(String[] args) {


        for (int i = 0; i<=10; i++ ){ // (CONDICION INICIAL; CONDICION DE STOP; CONDICION DE PASO)



            if (i==6){
              //  continue;
                break;
            }
            System.out.println("Hola mundo numero "+ i);
        }

    }
}
