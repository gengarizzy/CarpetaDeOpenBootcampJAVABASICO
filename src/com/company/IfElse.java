package com.company;

public class IfElse {

    public static void main(String[] args) {

        boolean check = 5 < 10;

        int number1 = 20;
        int number2 = 10;
        int number3= 5000;


        if (number1 < number2) {
            System.out.println("verdadero");
        } else if(number2<number3) { //ELSE IF suma otra condicion al bucle
            System.out.println("la segunda condicion es verdadera");
        }else{
            System.out.println("endloop");
        }

    }
}
